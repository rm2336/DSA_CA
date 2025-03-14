/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler.Interfaces;

import Classes.Node;

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
    
    public void insert(Node node);
    
    public int size();
    
    public Node search(int query);
    
    public boolean isEmpty();
    
    public String print();
    
}
