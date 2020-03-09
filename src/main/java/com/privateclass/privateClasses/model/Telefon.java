package com.privateclass.privateClasses.model;

import javax.persistence.*;

@Entity
public class Telefon
{
    @Id
    private int id_telefon;
    private int id_odzuvac;
    private String telefon;


    public Telefon(int id_telefon, int id_odzuvac, String telefon) {
        this.id_telefon = id_telefon;
        this.id_odzuvac = id_odzuvac;
        this.telefon = telefon;
    }


    public int getId_telefon() {
        return id_telefon;
    }

    public void setId_telefon(int id_telefon) {
        this.id_telefon = id_telefon;
    }

    public int getId_odzuvac() {
        return id_odzuvac;
    }

    public void setId_odzuvac(int id_odzuvac) {
        this.id_odzuvac = id_odzuvac;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


}
