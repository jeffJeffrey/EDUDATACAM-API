package com.eduDataCam.EDUDATACAM.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "Dim_Filiere")
@Data
public class DimFiliere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_filiere")
    private Integer idFiliere;

    @Column(name = "nom_filiere", nullable = false)
    private String nomFiliere;
}
