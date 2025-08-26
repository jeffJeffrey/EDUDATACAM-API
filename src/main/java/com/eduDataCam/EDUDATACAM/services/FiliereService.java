package com.eduDataCam.EDUDATACAM.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduDataCam.EDUDATACAM.models.DimFiliere;
import com.eduDataCam.EDUDATACAM.repository.DimFiliereRepository;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class FiliereService {

    private final DimFiliereRepository dimFiliereRepository;


    public List <DimFiliere> getAll(){
        return dimFiliereRepository.findAll();
    }
    
}
