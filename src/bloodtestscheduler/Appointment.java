/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import bloodtestscheduler.Patient;
import java.util.Date;

/**
 *
 * @author rokom
 * The appointment class stores the patient's information as well as the
 * appointment's urgency and whether they are coming from the hospital ward.
 */
public class Appointment {
    private Patient patient;
    private String priority;
    private boolean isFromWard;
    
    Appointment() {
        patient = null;
        priority = null;
        isFromWard = false;
    }
    
    Appointment(Patient patient, String priority, boolean fromWard) {
        this.patient = patient;
        this.priority = priority;
        this.isFromWard = fromWard;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isIsFromWard() {
        return isFromWard;
    }

    public void setIsFromWard(boolean isFromWard) {
        this.isFromWard = isFromWard;
    }
    
    @Override
    public String toString() {
        return "Name: " + patient.getName() + " " + patient.getSecondName() + "\n" + "DOB: " + patient.getDOB()
                + "\n" + "GP: " + patient.getDoctor().getName() +
                "\n" + "Urgency: " + priority + "\n" + "Referred From Ward: " + isFromWard;
    }
}
