package com.eduDataCam.EDUDATACAM.controllers;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduDataCam.EDUDATACAM.models.DimFiliere;
import com.eduDataCam.EDUDATACAM.services.FiliereService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/filieres")
public class FiliereController {

    private final FiliereService filiereService;


    @GetMapping
    public ResponseEntity<List<DimFiliere>> getAll(){
        new ResponseEntity<>(HttpStatusCode.valueOf(200));
        return ResponseEntity.ok(filiereService.getAll());
    }
    
}
