package com.eduDataCam.EDUDATACAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduDataCam.EDUDATACAM.models.DimSerie;

public interface DimSerieRepository extends JpaRepository<DimSerie, Integer> {
    DimSerie findByNomSerie(String nomSerie);
}