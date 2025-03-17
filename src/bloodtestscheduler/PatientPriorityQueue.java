/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import bloodtestscheduler.Interfaces.PriorityQueue;

/**
 *
 * @author rokom
 */
public class PatientPriorityQueue implements PriorityQueue {

    @Override
    public void enqueue(Object object, String priority) {
        // add patient to the queue based on their priority
        boolean foundPosition = false;
        int i = 0;
        if (queue.isEmpty()) {
            // creates the head
            queue.add(object);
            return;
        }
        while (!foundPosition) {
            // if the current element in the queue has a lower priority than the new one,
            // insert the new element at the current position
            
            // assigned the same priority level
            if (calculatePriority(((Appointment)queue.get(i)).getPriority()) == calculatePriority(priority) && !foundPosition) {
                System.out.println("Patients have the same priority.");
                // older patients have priority
                // compare birth years
                System.out.println(((Appointment)object).getPatient().getYear() + " " + ((Appointment)queue.get(i)).getPatient().getYear());
                if (((Appointment)object).getPatient().getYear() < ((Appointment)queue.get(i)).getPatient().getYear()) {
                    System.out.println("Comparing year of birth.");
                    queue.add(i, object);
                    foundPosition = true;
                }
                // compare birth months
                else if (((Appointment)object).getPatient().getMonth() < ((Appointment)queue.get(i)).getPatient().getMonth()) {
                    System.out.println("Comparing months.");
                    queue.add(i, object);
                    foundPosition = true;
                }
                // compare birth days
                else if (((Appointment)object).getPatient().getDay() < ((Appointment)queue.get(i)).getPatient().getDay()) {
                    System.out.println("Comparing birth day.");
                    queue.add(i, object);
                    foundPosition = true;
                }
                // patients coming from the hospital ward are more important than those
                else if (((Appointment)object).isIsFromWard() && !((Appointment)queue.get(i)).isIsFromWard()) {
                    System.out.println("Comparing whether they are coming from the ward.");
                    queue.add(i, object);
                    foundPosition = true;
                }
                else
                    i++;
            }
            else if (calculatePriority(((Appointment)queue.get(i)).getPriority()) < calculatePriority(priority)) {
                System.out.println("Comparing priority...");
                queue.add(i, object);
                foundPosition = true;
            }
            else {
                i++;
                System.out.println("Iterating...");
                // join the back of the queue
                if (i == queue.size() ) {
                    System.out.println("Back of the queue.");
                    queue.add(object);
                    return;
                }
            }
        }
    }

    @Override
    public void dequeue() {
        queue.remove(0);
    }

    @Override
    public Object head() {
        return queue.get(0);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String printQueue() {
        String output = "";
        int i = 0;
        for (Object tempObj : queue) {
            i++;
            Appointment apt = (Appointment)tempObj;
            output += i + ": " + apt.toString() + "\n\n";
        }
        return output;
    }

    @Override
    public int calculatePriority(String priority) {
        switch (priority) {
            case "Low":
                return 1;
            case "Medium":
                return 2;
            case "Urgent":
                return 3;
            default:
                return 0;
        }
    }  
}
