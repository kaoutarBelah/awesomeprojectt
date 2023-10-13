package com.example.Gestion_Abonnementtr.api.Model;
import jakarta.persistence.*;
@Entity
@Table
public class Voiture {
    @Id
    @SequenceGenerator(
            name="voiture_sequence",
            sequenceName = "voiture_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "voiture_sequence"
    )
    private int idVoiture;
    private String marque;
    private String modele;
    private float capaciteBatterie;
    @ManyToOne
    @JoinColumn(name = "userid")
    private Utilisateurr user;
    private int niveauCharge;

    public Voiture(String marque, String modele, float capaciteBatterie, Utilisateurr user, int niveauCharge) {
        this.marque = marque;
        this.modele = modele;
        this.capaciteBatterie = capaciteBatterie;
        this.user = user;
        this.niveauCharge = niveauCharge;
    }

    public Voiture() {

    }

    public int getIdVoiture() {
        return idVoiture;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public float getCapaciteBatterie() {
        return capaciteBatterie;
    }

    public Utilisateurr getId_user() {
        return user;
    }

    public int getNiveauCharge() {
        return niveauCharge;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setCapaciteBatterie(float capaciteBatterie) {
        this.capaciteBatterie = capaciteBatterie;
    }

    public void setId_user(Utilisateurr user) {
        user = user;
    }

    public void setNiveauCharge(int niveauCharge) {
        this.niveauCharge = niveauCharge;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "idVoiture=" + idVoiture +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", capaciteBatterie=" + capaciteBatterie +
                ", Id_user=" + user +
                ", niveauCharge=" + niveauCharge +
                '}';
    }
}
