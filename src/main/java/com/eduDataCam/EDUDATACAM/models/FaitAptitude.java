package com.eduDataCam.EDUDATACAM.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Fact")
@Data
public class FaitAptitude {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_choix")
    private Integer idAptitude;

    @Column(name = "id_etudiant")
    private Integer idEtudiant;

    @Column(name = "id_serie")
    private Integer idSerie;

    @Column(name = "id_date")
    private Integer idDate;

    @Column(name = "id_notes")
    private Integer idNotes;

    @Column(name = "id_filiere")
    private Integer idFiliere;

    @Column(name = "score_aptitude")
    private Float score_aptitude;
}
