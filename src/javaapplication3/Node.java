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
public class Node extends ListItem{
    
    public Node(Object value)
    {
        super(value);
    }

    @Override
    ListItem right() {
       return this.rightLink;
    }

    @Override
    ListItem setRight(ListItem item) {
        this.rightLink=item;
        return this.rightLink;
    }

    @Override
    ListItem left() {
        return this.leftLink;
    }

    @Override
    ListItem setLeft(ListItem item) {
        this.leftLink=item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if(item!=null)
        {
            return ((String)super.getValue()).compareTo((String)item.getValue());
        }
        else
        {
            return -1;
        }
    }
    
    public static ListItem createNode(Object value)
    {
        return new Node(value);
    }
    
}
