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
public class MyStackLink {

   ListItem top=null;
   MyStackLink(ListItem top)
   {
       this.top=top;
   }
   
   public ListItem getTop()
   {
       return this.top;
   }
   
   public boolean push(ListItem newItem)
   {
       if(this.top==null)
       {
           this.top=newItem;
           return true;
       }
       else
       {
           ListItem currentItem=this.top;
           newItem.setRight(currentItem);
           this.top=newItem;
           return true;
       }
   }
   
   public ListItem pop()
   {
       if(this.top==null)
       {
           System.out.println("stack has no elements");
           return null;
       }
       else
       {
           ListItem item=this.top;
           this.top=this.top.right();
           return item;
       }
   }
   public ListItem peek()
   {
       if(this.top==null)
       {
           System.out.println("The stack is empty");
           return null;
       }
       else
       {
          return top;
       }
       
   }
   
   public void traverse(ListItem item)
   {
       if(item==null)
       {
           System.out.println("stack is empty");
       }
       else
       {
           item=this.top;
           while(item!=null)
           {
               System.out.println("The value is  "+item.getValue());
               item=item.right();
           }
       }
   }
    
}
