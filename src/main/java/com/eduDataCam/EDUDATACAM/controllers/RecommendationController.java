package com.eduDataCam.EDUDATACAM.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduDataCam.EDUDATACAM.dto.BachelierRequest;
import com.eduDataCam.EDUDATACAM.dto.FiliereScoreResponse;
import com.eduDataCam.EDUDATACAM.services.RecommendationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    private final RecommendationService recommendationService;

    public RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @PostMapping
    public ResponseEntity<List<FiliereScoreResponse>> getFiliereRecommendations(@Valid @RequestBody BachelierRequest request) {
        List<FiliereScoreResponse> recommendations = recommendationService.getRecommendations(request);
        return ResponseEntity.ok(recommendations);
    }
}
