/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author rokom
 * The node class contains an element with data as well as two child nodes.
 */
public class Node {
    private Patient element;
    private Node leftChild;
    private Node rightChild;

    Node() {
        element = null;
        leftChild = null;
        rightChild = null;
    }
    
    Node(Patient object) {
       element = object;
       leftChild = null;
       rightChild = null;
    }
    
    public Patient getElement() {
        return element;
    }

    public void setElement(Patient element) {
        this.element = element;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
    
}
