package com.example.Gestion_Abonnementtr.api.Model;

import jakarta.persistence.*;

@Entity
@Table
public class FormuleAbonn {
    @Id
    @SequenceGenerator(
            name="Formule_sequence",
            sequenceName = "Formule_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Formule_sequence"
    )
    private int idFormule;
    private String type;
    private float tarif;

    public FormuleAbonn(String type, float tarif) {
        this.type = type;
        this.tarif = tarif;
    }

    public FormuleAbonn() {

    }

    public int getIdFormule() {
        return idFormule;
    }

    public String getType() {
        return type;
    }

    public float getTarif() {
        return tarif;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return "FormuleAbonn{" +
                "idFormule=" + idFormule +
                ", type='" + type + '\'' +
                ", tarif=" + tarif +
                '}';
    }
}
