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
public class MyLinkedList1 implements NodeLink {

   ListItem root=null; 

    public MyLinkedList1(ListItem root) {
        
        this.root=root;
    }

    

    
   
   
    @Override
    public ListItem getRoot() {
       return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
      if(root==null)
      {
          this.root=item;
          return true;
      }
      
      else
      {
          ListItem currentItem=this.root;
          ListItem currentItem1=currentItem.rightLink;
          while(currentItem!=null)
          {
              int comparsion=(currentItem).compareTo(item);
              if(this.root.rightLink==null)
              {
                  if(comparsion<0)
                  {
                      currentItem.setRight(item);
                      return true;
                  }
                  else if(comparsion>0)
                  {
                      item.setRight(currentItem);
                      this.root=item;
                      return true;
                      
                  }
                  else
                  {
                      System.out.println("Duplicates are not allowed"+item);
                      return false;
                  }
              } 
              else
                      {
                       int comparsion1=(currentItem1).compareTo(item);
                       if(comparsion<0 && comparsion1<0)
                       {
                       
                       
                          if(currentItem1.rightLink==null)
                          {
                              currentItem1.setRight(item);
                              return true;
                          }
                       else
                          {
                              currentItem=currentItem.rightLink;
                              currentItem1=currentItem1.rightLink;
                          }
                     
                       
                       
                      }
                       
                       else if(comparsion<0 && comparsion1>0)
                       {
                           
                           currentItem.setRight(item);
                           item.setRight(currentItem1);
                           return true;
                           
    
                           
                       }
              
                  else
                       {
                           item.setRight(currentItem);
                           this.root=item;
                           return true;
                       }
              
              
              
              
              
          }
          
          
          
      }
      return true;
    }
    }
    


    @Override
    public boolean removeItem(ListItem item) {
       if(this.root.getValue()==item.getValue())
       {
           if(this.root.rightLink==null)
           {
           this.root=null;
           return true;
           }
           else
           {
               this.root=this.root.rightLink;
               return true;
           }
       }
       else
       {
           ListItem currentItem=this.root;
           ListItem currentItem1=currentItem.rightLink;
           while(currentItem!=null)
           {
               int comparsion=currentItem.compareTo(item);
               int comparsion1=currentItem1.compareTo(item);
               if(comparsion<0 && comparsion1==0)
               {
                   
                       currentItem.setRight(currentItem1.rightLink);
                       return true;
                   
               }
               else
               {
                   currentItem=currentItem.rightLink;
                   currentItem1=currentItem1.rightLink;
               }
           }
           
       }
       return true;
    }

    @Override
    public void traverse(ListItem item) {
        if(this.root==null)
        {
            System.out.println("The liNked list is empty");
        }
       else
        {
            item=this.root;
            while(item!=null)
            {
                System.out.println(item.getValue());
                item=item.rightLink;
            }
           
        }
              
    }


    }