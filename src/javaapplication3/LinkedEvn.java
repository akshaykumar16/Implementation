/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Akshay16
 */
public class LinkedEvn {
 
    
    ListItem root=null;
    public ListItem getRoot()
    {
        return this.root;
    }
    
    private int checking(int vl)
    {
        if(vl%2==0)
        {
            return 2;
        } 
        else
        {
            return 1;
        }
            
    
        
    }
    
    public boolean addItem(ListItem newItem)
    {
        if(this.root==null)
        {
            this.root=newItem;
            return true;
            
        }
        else if(this.root.rightLink==null)
        {
            int idx=checking((int)newItem.getValue());
            if(idx==2)
            {
                newItem.setRight(this.root);
                this.root=newItem;
                return true;
            }
            else
            {
                this.root.setRight(newItem);
                return true;
            }
        }
        else
        {
            int idx=checking((int)newItem.getValue());
            ListItem item=this.root;
            
                if(idx==2)
                {
                    newItem.setRight(item);
                    this.root=newItem;
                    return true;
                }
                else
                {
                    while(item.rightLink!=null)
                    {
                        item=item.rightLink;
                    }
                    item.setRight(newItem);
                    return true;
                }
            
        }
            
    }
    
    
    
    
   public void traverse()
   {
       if(this.root==null)
       {
           System.out.println("Linked list is empty");
       }
       else
       {
           ListItem item=this.root;
           while(item!=null)
               
           {
               System.out.println("The values are "+item.getValue());
               item=item.rightLink;
           }
       }
   }
    
}
