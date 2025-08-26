package com.eduDataCam.EDUDATACAM.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Dim_Etudiant")
@Data
public class DimEtudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etudiant")
    private Integer idEtudiant;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "date_naissance")
    private java.time.LocalDate dateNaissance;

    @Column(name = "annee_naissance")
    private String anneeNaissance;

    @Column(name = "mois_naissance")
    private String moisNaissance;
    
    @Column(name = "jour_naissance")
    private String jourNaissance;

}