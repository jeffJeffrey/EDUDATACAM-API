package com.eduDataCam.EDUDATACAM.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Dim_NotesBac")
@Data
public class DimNotesBac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notes")
    private Integer idNotes;

    @Column(name = "id_etudiant")
    private Integer idEtudiant;

    @Column(name = "id_serie")
    private Integer idSerie;

    @Column(name = "moybac")
    private Float moybac;

    @Column(name = "note_math")
    private Float noteMath;

    @Column(name = "note_physique")
    private Float notePhysique;

    @Column(name = "note_chimie")
    private Float noteChimie;

    @Column(name = "note_svt")
    private Float noteSvt;

    @Column(name = "note_philosophie")
    private Float notePhilosophie;

    @Column(name = "note_lv1")
    private Float noteLv1;

    @Column(name = "note_lv2")
    private Float noteLv2;

    @Column(name = "note_histoire_geo")
    private Float noteHistoireGeo;

    @Column(name = "note_eps")
    private Float noteEps;

    @Column(name = "note_litterature")
    private Float noteLitterature;

    @Column(name = "note_electrotechnique")
    private Float noteElectrotechnique;

    @Column(name = "note_technologie")
    private Float noteTechnologie;

    @Column(name = "note_dessin_technique")
    private Float noteDessinTechnique;

    @Column(name = "note_comptabilite")
    private Float noteComptabilite;

    @Column(name = "note_economie")
    private Float noteEconomie;

    @Column(name = "note_marketing")
    private Float noteMarketing;

    @Column(name = "note_droit")
    private Float noteDroit;

    @Column(name = "note_informatique")
    private Float noteInformatique;

    @Column(name = "note_technologie_industrielle")
    private Float noteTechnologieIndustrielle;

    @Column(name = "note_construction")
    private Float noteConstruction;
}