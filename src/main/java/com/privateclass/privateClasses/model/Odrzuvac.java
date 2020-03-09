package com.privateclass.privateClasses.model;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
public class Odrzuvac
{
    @Id
    private int id;
    private String ime;
    private String prezime;
    private float cena;
    private String termin;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public String getTermin() {
        return termin;
    }

    public void setTermin(String termin) {
        this.termin = termin;
    }

    public Odrzuvac(int id, String ime, String prezime, float cena, String termin) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.cena = cena;
        this.termin = termin;
    }

    public Odrzuvac()
    {

    }

}
