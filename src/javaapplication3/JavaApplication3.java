/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;











/**
 *
 * @author AKshay16
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    
    
   
    public static void main(String[] args) {
        
        MyLinkedList mi=new MyLinkedList(null);
        
       
        
        //mi.addItem(new Node(11));
        
        mi.addItem(Node.createNode("3"));
       mi.addItem(Node.createNode("7"));
       mi.addItem(Node.createNode("8"));
        mi.addItem(Node.createNode("9"));
       
        
        mi.addItem(Node.createNode("5"));
       mi.addItem(Node.createNode("2"));
        mi.addItem(Node.createNode("1"));
       
       // mi.traverse(mi.root);
        CircularQueue cq=new CircularQueue(8);
        
        cq.enqueue(mi.root);
        while(!cq.isEmpty())
        {
            ListItem nde=cq.dequeue();
            System.out.println("The value is"+nde.getValue());
            if(nde.leftLink!=null)
            {
                cq.enqueue(nde.leftLink);
            }
            if(nde.rightLink!=null)
            {
                cq.enqueue(nde.rightLink);
            }
        }
    }
    
}