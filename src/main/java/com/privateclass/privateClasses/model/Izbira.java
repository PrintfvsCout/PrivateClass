package com.privateclass.privateClasses.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Izbira
{
    @Id private int id_izbira;
    private int id_korisnik;
    private int id_predmet;

    public Izbira(int id_izbira, int id_korisnik, int id_predmet)
    {
        this.id_izbira = id_izbira;
        this.id_korisnik = id_korisnik;
        this.id_predmet = id_predmet;
    }

    public int getId_izbira() {
        return id_izbira;
    }

    public void setId_izbira(int id_izbira) {
        this.id_izbira = id_izbira;
    }

    public int getId_korisnik() {
        return id_korisnik;
    }

    public void setId_korisnik(int id_korisnik) {
        this.id_korisnik = id_korisnik;
    }

    public int getId_predmet() {
        return id_predmet;
    }

    public void setId_predmet(int id_predmet) {
        this.id_predmet = id_predmet;
    }
}
