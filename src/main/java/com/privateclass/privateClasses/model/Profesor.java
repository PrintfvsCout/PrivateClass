package com.privateclass.privateClasses.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profesor
{
    @Id private int id;
    private int id_odzuvac;
    private String kvalifikacija;

    public Profesor(int id, int id_odzuvac, String kvalifikacija)
    {
        this.id = id;
        this.id_odzuvac = id_odzuvac;
        this.kvalifikacija = kvalifikacija;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_odzuvac() {
        return id_odzuvac;
    }

    public void setId_odzuvac(int id_odzuvac) {
        this.id_odzuvac = id_odzuvac;
    }

    public String getKvalifikacija() {
        return kvalifikacija;
    }

    public void setKvalifikacija(String kvalifikacija) {
        this.kvalifikacija = kvalifikacija;
    }
}
