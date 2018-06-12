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
public class QueueLinked {
    Node1 head=null;
    Node1 tail=null;
    private int numberOfItems;
    
    public Node1 getHead()
    {
        return this.head;
    }
    
    public boolean enqueue(Node1 newItem)
    {
        if(getHead()==null)
        {
            this.head=newItem;
            this.tail=newItem;
            return true;
        }
        else
        {
            Node1 item=this.tail;
            item.setNext(newItem);
            this.tail=newItem;
            return true;
                   
        }
    }
    
    public Node1 dequeue()
    {
        if(this.head==null)
        {
            System.out.println("The queue is empty");
            return null;
        }
        else
        {
            Node1 item=this.head;
            this.head=this.head.next;
            return item;
        }
            
    }
    
    
    public void traverse()
    {
        if(this.head==null)
        {
            System.out.println("The queue is empty");
        }
        else
        {
            Node1 temp=this.head;
            while(temp!=null)
            {
                System.out.println("The values are "+temp.getValue());
                temp=temp.next;
            }
        }
    }
    
    public boolean isEmpty()
    {
        return this.head==null;
    }
    
    
            
}
