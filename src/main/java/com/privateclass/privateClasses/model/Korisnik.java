package com.privateclass.privateClasses.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.ZonedDateTime;
import java.util.zip.ZipOutputStream;

@Entity
public class Korisnik
{

   @Id private int id;
    private String ime;
    private String prezime;
    private String nacin_plakjanje;
    private ZonedDateTime poseben_termin;

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

    public String getNacin_plakjanje() {
        return nacin_plakjanje;
    }

    public void setNacin_plakjanje(String nacin_plakjanje) {
        this.nacin_plakjanje = nacin_plakjanje;
    }

    public ZonedDateTime getPoseben_termin() {
        return poseben_termin;
    }

    public void setPoseben_termin(ZonedDateTime poseben_termin) {
        this.poseben_termin = poseben_termin;
    }
}
