package com.example.Gestion_Abonnementtr.api.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Inscription {
    @Id
    @SequenceGenerator(
            name="inscription_sequence",
            sequenceName = "inscription_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "inscription_sequence"
    )
    private int idInscription;
    @ManyToOne
    @JoinColumn(name = "userid")
    private Utilisateurr user;
    private LocalDate dateInscription;
    @ManyToOne
    @JoinColumn(name = "idFormule")
    private FormuleAbonn formul;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    public Inscription(Utilisateurr user, LocalDate dateInscription, FormuleAbonn formul, LocalDate dateDebut, LocalDate dateFin) {
        this.user = user;
        this.dateInscription = dateInscription;
        this.formul = formul;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Inscription() {

    }

    public int getIdInscription() {
        return idInscription;
    }

    public Utilisateurr getUser() {
        return user;
    }

    public LocalDate getDateInscription() {
        return dateInscription;
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

    public void setDateInscription(LocalDate dateInscription) {
        this.dateInscription = dateInscription;
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
        return "Inscription{" +
                "idInscription=" + idInscription +
                ", user=" + user +
                ", dateInscription=" + dateInscription +
                ", formul=" + formul +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                '}';
    }
}
