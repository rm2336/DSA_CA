/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler.Interfaces;

import java.util.ArrayList;

/**
 *
 * @author rokom
 * A priority queue is an abstract data structure in which elements
 * are added according to the First-In, First-Out principle and based
 * on a key that is dependent on the real-world problem.
 * This interface avails of an ArrayList to store the individual elements.
 * Methods commonly associated with priority queues are enqueue(), dequeue(),
 * head(), size(), isEmpty().
 */
public interface PriorityQueue {
    public ArrayList<Object> queue = new ArrayList<>();
    
    public void enqueue(Object object, String priority);
    
    public void dequeue();
    
    public Object head();
    
    public int size();
    
    public boolean isEmpty();
    
    public String printQueue();
    
    public int calculatePriority(String priority);
}
