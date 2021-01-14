/*
 * In Deque, we can remove and add the elements from both the side. 
 * Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
 */

/*
 * ArrayDeque class implements the Deque interface. 
 * Unlike queue, we can add or delete the elements from both the ends.
 * ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
 */


package com.yogesh.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
/**
 *
 * @author Yogesh
 */
public class ArrayDequePrograms {
    public static void main(String[] args) {
        
        Deque dq = new ArrayDeque();
        dq.add("Yogesh");
        dq.add(2);
        dq.add("Mitansh");
        dq.add(0);
        dq.add("Jagdish");
        dq.add(5);
        System.out.println("ArrayQueue elements");
        Iterator itr = dq.iterator();
        while(itr.hasNext())
            System.out.print(" "+itr.next());
        System.out.println("");
        
        dq.remove();
        System.out.println("ArrayQueue elements after remove");
        Iterator itr1 = dq.iterator();
        while(itr1.hasNext())
            System.out.print(" "+itr1.next());
        System.out.println("");
        
        dq.poll();
        System.out.println("ArrayQueue elements after poll");
        Iterator itr2 = dq.iterator();
        while(itr2.hasNext())
            System.out.print(" "+itr2.next());
        System.out.println("");
        
    }
}
