package com.example.Gestion_Abonnementtr.api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Abonnement {
    @Id
    @SequenceGenerator(
            name="Abonnement_sequence",
            sequenceName = "Abonnement_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Abonnement_sequence"
    )
    private int idAbonnement;
    @ManyToOne
    @JoinColumn(name = "userid")
    private Utilisateurr user;
    @ManyToOne
    @JoinColumn(name = "idFormule")
    private FormuleAbonn formul;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    public Abonnement(Utilisateurr user, FormuleAbonn formul, LocalDate dateDebut, LocalDate dateFin) {
        this.user = user;
        this.formul = formul;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Abonnement() {

    }

    public int getIdAbonnement() {
        return idAbonnement;
    }

    public Utilisateurr getUser() {
        return user;
    }

    public FormuleAbonn getFormul() {
        return formul;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setUser(Utilisateurr user) {
        this.user = user;
    }

    public void setFormul(FormuleAbonn formul) {
        this.formul = formul;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Abonnement{" +
                "idAbonnement=" + idAbonnement +
                ", user=" + user +
                ", formul=" + formul +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                '}';
    }
}
