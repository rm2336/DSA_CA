/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import bloodtestscheduler.GP;

/**
 *
 * @author rokom
 * The type of data that a blood test scheduler would collect on patients is
 * name, age, priority (urgent, medium, low), referral from a hospital ward,
 * and their GP details.
 */
public class Patient {
    private String name;
    private int age;
    private GP doctor;
    
    Patient() {
        name = "";
        age = 0;
        doctor = null;
    }
    // broader constructor for patient records
    Patient(String name, int age, GP doctor) {
        this.name = name;
        this.age = age;
        this.doctor = doctor;
    }
    
    // constructor for the blood test queue
    Patient(String name, int age, String priority, boolean isFromWard, GP doctor) {
        this.name = name;
        this.age = age;
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public GP getDoctor() {
        return doctor;
    }

    public void setDoctor(GP doctor) {
        this.doctor = doctor;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Age: " + age
                + "\n" + "GP: " + doctor;
    }
}
