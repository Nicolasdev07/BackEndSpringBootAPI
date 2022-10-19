package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "invites")
public class Invite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "disponible")
    private Boolean disponible;

    @Column(name = "apero")
    private Boolean apero;

    @Column(name = "repas")
    private Boolean repas;

    @Column(name = "vegetarien")
    private Boolean vegetarien;

    @Column(name = "danse")
    private Boolean danse;

    @Column(name = "dodo")
    private long dodo;

    @Column(name = "dimanche")
    private Boolean dimanche;

    @Column(name = "adulte")
    private Boolean adulte;

    @Column(name = "email")
    private String email;

    @Column(name = "choix_invitation")
    private long choixInvitation;

    @Column(name = "id_famille")
    private long idFamille;

    @Column(name = "commentaire")
    private String commentaire;

    public Boolean getApero() {
        return apero;
    }

    public void setApero(Boolean apero) {
        this.apero = apero;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Boolean getRepas() {
        return repas;
    }

    public void setRepas(Boolean repas) {
        this.repas = repas;
    }

    public Boolean getVegetarien() {
        return vegetarien;
    }

    public void setVegetarien(Boolean vegetarien) {
        this.vegetarien = vegetarien;
    }

    public Boolean getDanse() {
        return danse;
    }

    public void setDanse(Boolean danse) {
        this.danse = danse;
    }

    public long getDodo() {
        return dodo;
    }

    public void setDodo(long dodo) {
        this.dodo = dodo;
    }

    public Boolean getDimanche() {
        return dimanche;
    }

    public void setDimanche(Boolean dimanche) {
        this.dimanche = dimanche;
    }

    public Boolean getAdulte() {
        return adulte;
    }

    public void setAdulte(Boolean adulte) {
        this.adulte = adulte;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getChoixInvitation() {
        return choixInvitation;
    }

    public void setChoixInvitation(long choixInvitation) {
        this.choixInvitation = choixInvitation;
    }

    public long getIdFamille() {return idFamille;}

    public void setIdFamille(long idFamille) {this.idFamille = idFamille;}
}