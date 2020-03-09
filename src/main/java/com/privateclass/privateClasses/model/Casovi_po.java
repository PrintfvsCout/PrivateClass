package com.privateclass.privateClasses.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Casovi_po
{
    @Id private  int id_casovi_po;
    private int id_odrzuvac;
    private int id_predmet;
    private int vremetraenje;
    private String lokacija;

    public Casovi_po(int id_casovi_po, int id_odrzuvac, int id_predmet, int vremetraenje, String lokacija) {
        this.id_casovi_po = id_casovi_po;
        this.id_odrzuvac = id_odrzuvac;
        this.id_predmet = id_predmet;
        this.vremetraenje = vremetraenje;
        this.lokacija = lokacija;
    }

    public int getId_casovi_po() {
        return id_casovi_po;
    }

    public void setId_casovi_po(int id_casovi_po) {
        this.id_casovi_po = id_casovi_po;
    }

    public int getId_odrzuvac() {
        return id_odrzuvac;
    }

    public void setId_odrzuvac(int id_odrzuvac) {
        this.id_odrzuvac = id_odrzuvac;
    }

    public int getId_predmet() {
        return id_predmet;
    }

    public void setId_predmet(int id_predmet) {
        this.id_predmet = id_predmet;
    }

    public int getVremetraenje() {
        return vremetraenje;
    }

    public void setVremetraenje(int vremetraenje) {
        this.vremetraenje = vremetraenje;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }
}
