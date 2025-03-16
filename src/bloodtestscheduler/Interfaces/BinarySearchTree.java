/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler.Interfaces;

import bloodtestscheduler.Node;
import bloodtestscheduler.Patient;
import java.util.ArrayList;

/**
 *
 * @author rokom
 * A binary search tree is a non-linear data structure where elements i.e. nodes
 * are connected to its root via edges. A node can have two children at most
 * with the left-hand value being less than and the right-hand value being
 * greater than its value.
 * Frequently implemented methods are insert(), size(), search(),
 * isEmpty(), print().
 */
public interface BinarySearchTree {
    
    public Node getRoot();
    
    public ArrayList<Patient> getPatients();
    
    public void insert(Patient object, Node currentNode);
    
    public int size();
    
    public Node search(String query, Node currentNode);
    
    public boolean isEmpty();
    
    public void print(Node currentNode);
    
    public void traverseTree(Node currentNode);
    
    public void resetTraversal();
    
}
