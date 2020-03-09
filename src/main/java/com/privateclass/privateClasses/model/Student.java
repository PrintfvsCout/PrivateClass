package com.privateclass.privateClasses.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
    @Id private int id;
    private int id_odzuvac;
    private String godina;

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

    public String getGodina() {
        return godina;
    }

    public void setGodina(String godina) {
        this.godina = godina;
    }

    public Student(int id, int id_odzuvac, String godina) {
        this.id = id;
        this.id_odzuvac = id_odzuvac;
        this.godina = godina;
    }
}
