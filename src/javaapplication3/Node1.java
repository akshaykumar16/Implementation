/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author AKshay16
 */
public class Node1 {
    
    
    Node1 next=null;
    Node1 previous=null;
    private Object value;

    public Node1 getNext() {
        return next;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }

    public Node1 getPrevious() {
        return previous;
    }

    public void setPrevious(Node1 previous) {
        this.previous = previous;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    
   
    
}
