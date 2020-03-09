package com.privateclass.privateClasses.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Predmet
{
    @Id private int id;

    public Predmet(int id, String ime, String nasoka, String preduslov)
    {
        this.id = id;
        this.ime = ime;
        this.nasoka = nasoka;
        this.preduslov = preduslov;
    }

    private String ime;
    private String nasoka;
    private String preduslov;

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

    public String getNasoka() {
        return nasoka;
    }

    public void setNasoka(String nasoka) {
        this.nasoka = nasoka;
    }

    public String getPreduslov() {
        return preduslov;
    }

    public void setPreduslov(String preduslov) {
        this.preduslov = preduslov;
    }
}
