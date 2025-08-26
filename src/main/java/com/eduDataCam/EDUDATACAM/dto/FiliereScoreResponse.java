package com.eduDataCam.EDUDATACAM.dto;

import lombok.Data;

@Data
public class FiliereScoreResponse {
    private String nomFiliere;
    private float scoreAptitude; 
    private Integer nombreEtudiantsSimilaires;
    
    public String getScoreFormatted() {
        return String.format("%.1f%%", scoreAptitude);
    }
}