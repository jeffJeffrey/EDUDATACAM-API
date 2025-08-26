package com.eduDataCam.EDUDATACAM.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduDataCam.EDUDATACAM.models.DimSerie;
import com.eduDataCam.EDUDATACAM.repository.DimSerieRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class SerieService {
    
    private final DimSerieRepository dimSerieRepository;

    public List <DimSerie> getAll(){
        return dimSerieRepository.findAll();
    }
}
