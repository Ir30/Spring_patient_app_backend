package com.example.PatientApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient_model {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String doctor;
    private int age;
    private String img;


    public Patient_model() {
    }

    public Patient_model(int id, String name, String doctor, int age, String img) {
        this.id = id;
        this.name = name;
        this.doctor = doctor;
        this.age = age;
        this.img = img;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDoctor() {
        return doctor;
    }

    public int getAge() {
        return age;
    }

    public String getImg() {
        return img;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
