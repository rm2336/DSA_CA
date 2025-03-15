/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import bloodtestscheduler.Interfaces.BinarySearchTree;

/**
 *
 * @author rokom
 * This binary tree stores patients' details. They are inserted lexicographically,
 * i.e. the same way terms are sorted in a dictionary.
 */
public class PatientBinaryTree implements BinarySearchTree {

    private Node root;
    
    PatientBinaryTree() {
        root = null;
    }
    
    public Node getRoot() {
        return root;
    }
    
    @Override
    public void insert(Patient object, Node currentNode) {
        // insert the first node
        if (currentNode == null) {
            root = new Node(object);
        } else {    // check if the object to be inserted is less than or greater than the parent
            if (object.getName().compareTo(currentNode.getElement().getName()) < 0) {
                if (currentNode.getLeftChild() == null) {
                    currentNode.setLeftChild(new Node(object));
                }
                else
                    insert(object, currentNode.getLeftChild());
            }
            else if (object.getName().compareTo(currentNode.getElement().getName()) > 0) {
                if (currentNode.getRightChild() == null) {
                    currentNode.setRightChild(new Node(object));
                }
                else
                    insert(object, currentNode.getRightChild());
            }
        }
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Node search(String query, Node currentNode) {
        if (currentNode == null) {
            return null;
        }
        else {
            if (query.equals(currentNode.getElement()))
                return currentNode;
            else if (query.compareTo(((Patient)currentNode.getElement()).getName()) < 0) {
                return search(query, currentNode.getLeftChild());
            }
            else
                return search(query, currentNode.getRightChild());
        }
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void print(Node currentNode) { // traverse the tree
            System.out.println(currentNode.getElement());
            if (currentNode.getLeftChild() != null)
                print(currentNode.getLeftChild());
            if (currentNode.getRightChild() != null)
                print(currentNode.getRightChild());
        }
}
