package com.example.Gestion_Abonnementtr.api.Model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import jakarta.persistence.*;
@Entity
@Table
public class Carte {
    @Id
    @SequenceGenerator(
            name="Carte_sequence",
            sequenceName = "Carte_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Carte_sequence"
    )
    private int idCarte;
    private int numCarte;
    private LocalDate date_expiration;
    @ManyToOne
    @JoinColumn(name = "userid")
    private Utilisateurr user;

    public Carte(int numCarte, LocalDate date_expiration, Utilisateurr user) {
        this.numCarte = numCarte;
        this.date_expiration = date_expiration;
        this.user = user;
    }

    public Carte() {

    }

    public int getIdCarte() {
        return idCarte;
    }

    public int getNumCarte() {
        return numCarte;
    }

    public LocalDate getDate_expiration() {
        return date_expiration;
    }

    public Utilisateurr getUser() {
        return user;
    }

    public void setNumCarte(int numCarte) {
        this.numCarte = numCarte;
    }

    public void setDate_expiration(LocalDate date_expiration) {
        this.date_expiration = date_expiration;
    }

    public void setUser(Utilisateurr user) {
        this.user = user;
    }
}
