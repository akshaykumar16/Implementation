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
public class CircularQueue {
    
    
    private ListItem[] queue;
    public int front;
    public int rear;
    public int numberOfItems;
    public CircularQueue(int n)
    {
        this.queue=new Node[n];
        this.front=-1;
        this.rear=-1;
        this.numberOfItems=0;
        
    }
    
    public boolean isEmpty()
    {
        return this.numberOfItems==0;
    }
    
    private int getIndex()
    {
        return ++rear%this.queue.length;
    }
    
    private int getIndex1()
    {
        return ++front%this.queue.length;
    }
    
    public boolean enqueue(ListItem ele)
    {
        if(this.numberOfItems==queue.length)
        {
            return false;
        }
        else
        { 
          int index=getIndex(); 
          queue[index]=ele;
          numberOfItems++;
          return true;
        }
    }
    
    
    public ListItem dequeue()
    {
        if(this.numberOfItems==-1)
        {
            return null;
        }
        else
        {
           int index=getIndex1();
            numberOfItems--;
            return queue[index];
        }
    }


    
   public void traverse()
   {
       if(this.numberOfItems==0)
       {
           System.out.println("The circular queue is empty");
       }
       
       else
       {
           int temp=-1;
           int temp1=this.front;
           
           while(temp<this.numberOfItems-1)
           {
               temp1=++temp1%this.queue.length;
               System.out.println("The values are"+queue[temp1]);
               //temp=temp%this.queue.length;
               temp++;
           }
       }
   }
    
    
    
}
