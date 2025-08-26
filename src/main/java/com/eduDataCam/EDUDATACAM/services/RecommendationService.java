package com.eduDataCam.EDUDATACAM.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.eduDataCam.EDUDATACAM.dto.BachelierRequest;
import com.eduDataCam.EDUDATACAM.dto.FiliereScoreResponse;
import com.eduDataCam.EDUDATACAM.models.DimNotesBac;
import com.eduDataCam.EDUDATACAM.models.DimSerie;
import com.eduDataCam.EDUDATACAM.repository.DimNotesBacRepository;
import com.eduDataCam.EDUDATACAM.repository.DimSerieRepository;
import com.eduDataCam.EDUDATACAM.repository.FaitAptitudeRepository;

@Service
public class RecommendationService {

    private final DimSerieRepository serieRepository;
    private final DimNotesBacRepository notesBacRepository;
    private final FaitAptitudeRepository faitAptitudeRepository;

    public RecommendationService(
            DimSerieRepository serieRepository,
            DimNotesBacRepository notesBacRepository,
            FaitAptitudeRepository faitAptitudeRepository) {
        this.serieRepository = serieRepository;
        this.notesBacRepository = notesBacRepository;
        this.faitAptitudeRepository = faitAptitudeRepository;
    }

    public List<FiliereScoreResponse> getRecommendations(BachelierRequest request) {
        DimSerie serie = serieRepository.findByNomSerie(request.getNomSerie());
        if (serie == null) {
            throw new IllegalArgumentException("Série inconnue : " + request.getNomSerie());
        }

        List<DimNotesBac> similarEtudiants = notesBacRepository.findSimilarEtudiants(
                request.getNomSerie(),
                request.getMoyBac(),
                request.getNoteMath(),
                request.getNotePhysique(),
                request.getNoteChimie(),
                request.getNoteSvt(),
                request.getNotePhilosophie(),
                request.getNoteLv1(),
                request.getNoteLitterature(),
                request.getNoteHistoireGeo(),
                request.getNoteElectrotechnique(),
                request.getNoteConstruction(),
                request.getNoteComptabilite(),
                request.getNoteEconomie(),
                request.getNoteMarketing(),
                request.getNoteDroit(),
                request.getNoteInformatique(),
                request.getNoteTechnologieIndustrielle()
        );

        List<Object[]> averageScores;
        
        if (!similarEtudiants.isEmpty()) {
            List<Integer> idEtudiants = similarEtudiants.stream()
                    .map(DimNotesBac::getIdEtudiant)
                    .collect(Collectors.toList());
            
            averageScores = faitAptitudeRepository.findAverageScoresByEtudiants(idEtudiants);
        } else {
            averageScores = faitAptitudeRepository.findAverageScoresBySerie(request.getNomSerie());
        }

        return averageScores.stream()
                .map(score -> {
                    FiliereScoreResponse response = new FiliereScoreResponse();
                    response.setNomFiliere((String) score[0]);
                    float avgScore = ((Number) score[1]).floatValue();
                    response.setScoreAptitude((avgScore / 20) * 100);
                    
                    if (score.length > 2) {
                        response.setNombreEtudiantsSimilaires(((Number) score[2]).intValue());
                    }
                    
                    return response;
                })
                .collect(Collectors.toList());
    }
}