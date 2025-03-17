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
    private String name, secondName;
    private int day, month, year;
    private GP doctor;
    
    Patient() {
        name = "";
        day = 0;
        month = 0;
        year = 0;
        doctor = null;
    }
    // constructor for patient records
    Patient(String name, String secondName, int day, int month, int year, GP doctor) {
        this.name = name;
        this.secondName = secondName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public GP getDoctor() {
        return doctor;
    }

    public void setDoctor(GP doctor) {
        this.doctor = doctor;
    }
    
    public String getDOB() {
        return day + "/" + month + "/" + year;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Second Name: " + secondName + " \n" + "DOB: " + getDOB() 
                + "\n" + "GP: " + doctor;
    }
}
