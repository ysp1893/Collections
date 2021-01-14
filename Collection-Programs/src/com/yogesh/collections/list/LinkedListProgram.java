/*
 * LinkedList uses doubly linked list internally to store the elements.
 * It can store the duplicate elements
 * It maintain the insertion order and is not synchronized.
 */
package com.yogesh.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Administrator
 */
public class LinkedListProgram {
    
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<String>();    //Only store String type of value
        List list2 = new LinkedList<String>();  //Can be store any type of value.
        List nlist = new LinkedList();  //Can be store any type of value.
        
        nlist.add("Yogesh");
        nlist.add(2);
        nlist.add(1.5);
        nlist.add('w');
        nlist.add("Yogesh");
        
        System.out.println("nList before remove any element");
        Iterator itr = nlist.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("");
        
        nlist.remove(2);    //Remove element at index 2.
        nlist.remove("Yogesh"); //
        System.out.println("nList after remove at index 2 and value 'Yogesh' element");
        Iterator itr1 = nlist.iterator();
        while(itr1.hasNext()){
            System.out.print(itr1.next()+" ");
        }
        System.out.println("");
        
        list2.add(1);
        list2.add(1.2);
        list2.add("Yogesh");
        Iterator itr2 = list2.iterator();
        while(itr2.hasNext()){
            System.out.print(itr2.next()+" ");
        }
        System.out.println("DataType stores");
        
        Iterator itr3 = list2.iterator();
        while(itr3.hasNext()){
            System.out.print(itr3.next().getClass().getName()+" ");
        }
        
        // the valriable list1 of type String only store String variable
        //list1.add(1);   //Get Error: No suitable method found.
    }
    
}
