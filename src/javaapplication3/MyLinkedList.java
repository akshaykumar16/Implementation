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
public class MyLinkedList implements NodeLink {
    
    
    ListItem root=null;
    
     MyLinkedList(ListItem root)
    {
        this.root=root;
    }
     

    @Override
    public ListItem getRoot() {
        
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        
        if(this.root==null)
        {
            this.root=newItem;
            return true;
        }
        else
        {
            ListItem currentItem=this.root;
            while(currentItem!=null)
            {
                int comparsion=currentItem.compareTo(newItem);
                if(comparsion>0)
                     {
                         
                         if(currentItem.left()==null)
                         {
                             currentItem.setLeft(newItem);
                             return true;
                         }
                         else
                         {
                             currentItem=currentItem.left();
                         }
                    
                }
                
                else if(comparsion<0)
                {
                    if(currentItem.right()==null)
                    {
                        currentItem.setRight(newItem);
                        return true;
                    }
                    else
                    {
                        currentItem=currentItem.right();
                    }
                }
                
                else
                {
                    System.out.println("duplicates not allowed");
                    return false;
                }
                
            }
            
            
        }
        
        
        
        
return false;
        
        
        
        
        
    }

    @Override
    public boolean removeItem(ListItem item) throws NullPointerException{
        if(this.root==null)
        {
            System.out.println("The tree is empty");
            return true;
        }
        else
        { 
            ListItem currentItem=this.root;
            ListItem currentItem1=currentItem.leftLink;
            ListItem currentItem2=currentItem.rightLink;
           while(currentItem!=null)
           {
               int comparsion=currentItem.compareTo(item);
               
               
               if(comparsion>0)
               {
               int comparsion1=currentItem1.compareTo(item);
                   if(comparsion1>0)
                   {
                       currentItem=currentItem.leftLink;
                       currentItem1=currentItem.leftLink;
                       currentItem2=currentItem.rightLink;
                       
                   }
                   else if(comparsion1<0)
                   {
                       currentItem=currentItem.leftLink;
                       currentItem1=currentItem.leftLink;
                       currentItem2=currentItem.rightLink;
                       
                   }
                   else
                   {
                       
                       if(currentItem1.left()!=null && currentItem1.right()!=null)
                       {
                           
                         if(currentItem1.rightLink.leftLink!=null)
                         {
                          ListItem temp=currentItem1.left();
                          while(temp.rightLink!=null)
                          {
                              temp=temp.rightLink;
                          }
                             
                          temp.setRight(currentItem1.rightLink.leftLink);
                          currentItem1.rightLink.setLeft(null);
                             
                         }
                         currentItem1.rightLink.setLeft(currentItem1.leftLink);
                         currentItem.setLeft(currentItem1.rightLink);
                       
                       return true;
                       
                       
                       
                       
                       
                       }
                       
                     
            
                       
                       else if(currentItem1.rightLink!=null)
                       {
            
                           currentItem.setLeft(currentItem1.rightLink);
                           return true;
                       }
                       else if(currentItem1.leftLink!=null)
                       {
                           //System.out.println("herere");
                           currentItem.setLeft(currentItem1.leftLink);
                           return true;
                       }
                       else if(currentItem1.left()==null && currentItem1.right()==null)
                       {
                       
                          currentItem.setLeft(null);
                          return true;
                       }
                      
                   }
                   
               }
               else if(comparsion<0)
               {
                   //System.out.println("herere");
                   int comparsion2=currentItem2.compareTo(item);
                   if(comparsion2<0 || comparsion2>0)
                   {
                       //System.out.println("inside");
                       currentItem=currentItem.rightLink;
                       currentItem1=currentItem.leftLink;
                       currentItem2=currentItem.rightLink;
                   }
                   else
                   {
                       
                       if(currentItem2.rightLink!=null)
                       {
                           currentItem.setRight(currentItem2.rightLink);
                           return true;
                       }
                       else if(currentItem2.leftLink!=null)
                       {
                           currentItem.setLeft(currentItem2.leftLink);
                           return true;
                       }
                       
                           
                       
                      else if(currentItem2.left()==null && currentItem2.right()==null)
                       {
                       
                      currentItem.setRight(null);
                      return true;
                       }
                   }
               }
            
            
            
           }
            
            
        }
        
        
        
      return true;  
    }

    @Override
    public void traverse(ListItem root) {
        
        if(root!=null)
        {
            traverse(root.left());
            System.out.println(root.getValue());
            traverse(root.right());
        }
    }
    
    
    public ListItem getMinimum()
    {
        if(this.root==null)
        {
            System.out.println("The tree is empty");
            return null;
            
        }
        else
        {
            ListItem item=this.root;
            while(item.leftLink!=null)
            {
                item=item.leftLink;
               // System.out.println(item.getValue());
            }
            
            return item;
        }
    }
    
    public int maximumDepth(ListItem item)
    {
        if(this.root==null)
        {
            return 0;
        }
        else if(root.leftLink==null && root.rightLink==null)
        {
            return 0;
        }
        if(item.leftLink!=null)
        {
            
           item=item.leftLink;
            int leftDepth=1+maximumDepth(item);
            //int rightDepth=1+maximumDepth(item.right());
        return leftDepth;
        }
       return 0;
        
    }
    
    public void Mirror(ListItem item)
    {
        if(root==null)
        {
            System.out.println("The tree is null");
        }
        
        else
        {
            if(item.leftLink!=null || item.rightLink!=null)
            {
                ListItem item1=item.rightLink;
                ListItem item2=item.leftLink;
                if(item1!=null)
                {
                     item.setLeft(item1);
                }
                if(item2!=null)
                {
                    item.setRight(item2);
                }
               
            }
            
        }
    }
    
    
    
    
    
}
