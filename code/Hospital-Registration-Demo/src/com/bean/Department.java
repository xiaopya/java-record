package com.bean;

import java.util.ArrayList;

/**
 * 科室
 */
public class Department {
    private String name; // 科室名称
    private ArrayList<Doctor> doctors = new ArrayList<>(); // 该科室的医生

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
}
