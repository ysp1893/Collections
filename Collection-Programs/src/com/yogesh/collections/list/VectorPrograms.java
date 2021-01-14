/*
 * Vectore has Dynamic array to store data  elements
 * Similar to arrayList
 * It is Synchronized
 * Can store duplicate values.
 */
package com.yogesh.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Administrator
 */
public class VectorPrograms {
    
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(); //Can store only Strig type of values
        v.add("Yogesh");
        v.add("Mitansh");
        v.add("Jagdish");
        v.add("Pagal");
        v.add("Psycho");
        v.add("Yogesh");
        
        Iterator itr = v.iterator();
        System.out.println("Vector before remove any element");
        while(itr.hasNext())
            System.out.print(" "+itr.next());
        
        System.out.println("\n Vectore after remove element");
        v.remove("Psycho"); //Remove Psycho element
        v.remove(3);    //Remove element at index 3
        
        Iterator itr1 = v.iterator();
        while(itr1.hasNext())
            System.out.print(" "+itr1.next());
        System.out.println("");
        
        List vList = new Vector();
        
        vList.add("Yogesh");
        vList.add(1);
        vList.add(1.2);
        
        Iterator itr2 = vList.iterator();
        while(itr2.hasNext())
            System.out.print(itr2.next()+" ");
        System.out.println("");
    }
}
