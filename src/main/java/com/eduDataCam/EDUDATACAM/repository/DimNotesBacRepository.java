package com.eduDataCam.EDUDATACAM.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.eduDataCam.EDUDATACAM.models.DimNotesBac;

public interface DimNotesBacRepository extends JpaRepository<DimNotesBac, Integer> {
    
    @Query("SELECT n FROM DimNotesBac n JOIN DimSerie s ON n.idSerie = s.idSerie " +
           "WHERE s.nomSerie = :nomSerie " +
           "AND (:moyBac IS NULL OR ABS(n.moybac - :moyBac) <= 2) " +
           "ORDER BY " +
           "CASE WHEN :noteMath IS NOT NULL THEN ABS(COALESCE(n.noteMath, 0) - :noteMath) ELSE 0 END + " +
           "CASE WHEN :notePhysique IS NOT NULL THEN ABS(COALESCE(n.notePhysique, 0) - :notePhysique) ELSE 0 END + " +
           "CASE WHEN :noteChimie IS NOT NULL THEN ABS(COALESCE(n.noteChimie, 0) - :noteChimie) ELSE 0 END + " +
           "CASE WHEN :noteSvt IS NOT NULL THEN ABS(COALESCE(n.noteSvt, 0) - :noteSvt) ELSE 0 END + " +
           "CASE WHEN :notePhilosophie IS NOT NULL THEN ABS(COALESCE(n.notePhilosophie, 0) - :notePhilosophie) ELSE 0 END + " +
           "CASE WHEN :noteLv1 IS NOT NULL THEN ABS(COALESCE(n.noteLv1, 0) - :noteLv1) ELSE 0 END + " +
           "CASE WHEN :noteLitterature IS NOT NULL THEN ABS(COALESCE(n.noteLitterature, 0) - :noteLitterature) ELSE 0 END + " +
           "CASE WHEN :noteHistoireGeo IS NOT NULL THEN ABS(COALESCE(n.noteHistoireGeo, 0) - :noteHistoireGeo) ELSE 0 END + " +
           "CASE WHEN :noteElectrotechnique IS NOT NULL THEN ABS(COALESCE(n.noteElectrotechnique, 0) - :noteElectrotechnique) ELSE 0 END + " +
           "CASE WHEN :noteConstruction IS NOT NULL THEN ABS(COALESCE(n.noteConstruction, 0) - :noteConstruction) ELSE 0 END + " +
           "CASE WHEN :noteComptabilite IS NOT NULL THEN ABS(COALESCE(n.noteComptabilite, 0) - :noteComptabilite) ELSE 0 END + " +
           "CASE WHEN :noteEconomie IS NOT NULL THEN ABS(COALESCE(n.noteEconomie, 0) - :noteEconomie) ELSE 0 END + " +
           "CASE WHEN :noteMarketing IS NOT NULL THEN ABS(COALESCE(n.noteMarketing, 0) - :noteMarketing) ELSE 0 END + " +
           "CASE WHEN :noteDroit IS NOT NULL THEN ABS(COALESCE(n.noteDroit, 0) - :noteDroit) ELSE 0 END + " +
           "CASE WHEN :noteInformatique IS NOT NULL THEN ABS(COALESCE(n.noteInformatique, 0) - :noteInformatique) ELSE 0 END + " +
           "CASE WHEN :noteTechnologieIndustrielle IS NOT NULL THEN ABS(COALESCE(n.noteTechnologieIndustrielle, 0) - :noteTechnologieIndustrielle) ELSE 0 END ASC")
    List<DimNotesBac> findSimilarEtudiants(
            @Param("nomSerie") String nomSerie,
            @Param("moyBac") Float moyBac,
            @Param("noteMath") Float noteMath,
            @Param("notePhysique") Float notePhysique,
            @Param("noteChimie") Float noteChimie,
            @Param("noteSvt") Float noteSvt,
            @Param("notePhilosophie") Float notePhilosophie,
            @Param("noteLv1") Float noteLv1,
            @Param("noteLitterature") Float noteLitterature,
            @Param("noteHistoireGeo") Float noteHistoireGeo,
            @Param("noteElectrotechnique") Float noteElectrotechnique,
            @Param("noteConstruction") Float noteConstruction,
            @Param("noteComptabilite") Float noteComptabilite,
            @Param("noteEconomie") Float noteEconomie,
            @Param("noteMarketing") Float noteMarketing,
            @Param("noteDroit") Float noteDroit,
            @Param("noteInformatique") Float noteInformatique,
            @Param("noteTechnologieIndustrielle") Float noteTechnologieIndustrielle
    );
}