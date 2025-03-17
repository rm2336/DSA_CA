/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import bloodtestscheduler.Interfaces.Queue;

/**
 *
 * @author rokom
 * The no-show queue keeps track of the last 5 people that failed to attend
 * their appointed blood test.
 */
public class NoShowQueue implements Queue{

    @Override
    public void enqueue(Object object) {
        if (size() < 5)
            queue.add(object);
        else {
            dequeue();
            queue.add(object);
        }
    }

    @Override
    public void dequeue() {
        queue.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public Object head() {
        return queue.get(0);
    }

    @Override
    public String printQueue() {
        String output = "";
        int k = 1;
        for (int i = size() - 1; i >= 0; i--, k++)
            output += k + ": " + queue.get(i).toString() + "\n\n";
        return output;
    }
    
}
