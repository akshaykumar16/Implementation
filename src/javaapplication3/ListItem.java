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
public abstract class ListItem {
    
    ListItem rightLink=null;
    ListItem leftLink=null;
  
    
    private Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
    abstract ListItem right();
    abstract ListItem setRight(ListItem item);
    abstract ListItem left();
    abstract ListItem setLeft(ListItem item);
    abstract int compareTo(ListItem item);
    
}
