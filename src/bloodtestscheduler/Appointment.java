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
 * The appointment class stores the patient's information as well as the date
 * of their blood test
 */
public class Appointment {
    private Patient patient;
    private Date testDate;
    
    Appointment() {
        patient = null;
        testDate = null;
    }
    
    Appointment(Patient patient, Date date) {
        this.patient = patient;
        this.testDate = date;
    }
}
