package com.eduDataCam.EDUDATACAM.controllers;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduDataCam.EDUDATACAM.models.DimSerie;
import com.eduDataCam.EDUDATACAM.services.SerieService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/series")
@AllArgsConstructor
public class SerieController {
    
    private final SerieService serieService;


    @GetMapping
    public ResponseEntity <List<DimSerie>>  geAll(){
        new ResponseEntity<>(HttpStatusCode.valueOf(200));
        return ResponseEntity.ok(serieService.getAll());
    }
}
