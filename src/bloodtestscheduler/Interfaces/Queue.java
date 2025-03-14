/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler.Interfaces;

import java.util.ArrayList;

/**
 *
 * @author rokom
 * A queue is an abstract data type that stores elements in a linear sequence.
 * Operations are performed based on the First-In, First-Out principle.
 * Commonly defined methods are size(), isEmpty(), enqueue(), dequeue(), head()
 * and print().
 */
public interface Queue {
    public ArrayList<Object> queue = new ArrayList<>();
    
    public void enqueue(Object object);
    
    public void dequeue();
    
    public boolean isEmpty();
    
    public int size();
    
    public Object head();
    
    public String printQueue();
}
