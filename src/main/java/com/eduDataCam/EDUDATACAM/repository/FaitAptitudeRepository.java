package com.eduDataCam.EDUDATACAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

import com.eduDataCam.EDUDATACAM.models.FaitAptitude;

public interface FaitAptitudeRepository extends JpaRepository<FaitAptitude, Integer> {
    
    @Query("SELECT f.nomFiliere, AVG(fa.score_aptitude) as avgScore, COUNT(fa.idEtudiant) as studentCount " +
           "FROM FaitAptitude fa " +
           "JOIN DimFiliere f ON fa.idFiliere = f.idFiliere " +
           "WHERE fa.idEtudiant IN :idEtudiants " +
           "GROUP BY f.idFiliere, f.nomFiliere " +
           "ORDER BY avgScore DESC")
    List<Object[]> findAverageScoresByEtudiants(@Param("idEtudiants") List<Integer> idEtudiants);

    @Query("SELECT f.nomFiliere, AVG(fa.score_aptitude) as avgScore " +
           "FROM FaitAptitude fa " +
           "JOIN DimFiliere f ON fa.idFiliere = f.idFiliere " +
           "JOIN DimSerie s ON fa.idSerie = s.idSerie " +
           "WHERE s.nomSerie = :nomSerie " +
           "GROUP BY f.idFiliere, f.nomFiliere " +
           "ORDER BY avgScore DESC")
    List<Object[]> findAverageScoresBySerie(@Param("nomSerie") String nomSerie);
}