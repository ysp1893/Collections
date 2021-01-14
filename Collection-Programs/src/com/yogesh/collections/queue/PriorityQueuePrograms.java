/*
 * Queue interface maintains the first-in-first-out order.
 * It can be defined as an ordered list that is used to hold the elements which are about to be processed.
 */

/*
 * PriorityQueue
 * It holds the elements or objects which are to be processed by their priorities. 
 * PriorityQueue doesn't allow null values to be stored in the queue.
 * The priority of the elements in the priorityqueue determine the order in which elements are  removed from the PQ.
 */
package com.yogesh.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 *
 * @author Yogesh
 */
public class PriorityQueuePrograms {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("Yogesh");
        q.add("Mitansh");
        q.add("Jagdish");
        q.add("Kalpesh");
        
        Iterator itr = q.iterator();
        System.out.println("Priority Queue before change in object");
        
        while(itr.hasNext())
            System.out.print(" "+itr.next());
        // OUTput: Jagdish Kalpesh Mitansh Yogesh
        // Priority maintain from the alphabetical words
        System.out.println("");
        q.remove();
        
        Iterator itr1 = q.iterator();
        System.out.println("Priority Queue after remove from queue");
        
        while(itr1.hasNext())
            System.out.print(" "+itr1.next());
        //OUTput: Kalpesh Yogesh Mitansh
        //q.remove() remove first element.
        System.out.println("");
        
        q.poll();
        
        Iterator itr2 = q.iterator();
        System.out.println("Priority Queue after poll from queue");
        
        while(itr2.hasNext())
            System.out.print(" "+itr2.next());
        //OUTput: Mitansh Yogesh
        //q.poll() remove first element.
        System.out.println("");
        System.out.println("Priority Queue for integers");
        
        Queue q1 = new PriorityQueue();
        q1.add(1);
        q1.add(5);
        q1.add(3);
        q1.add(7);
        q1.add(0);
        q1.add(9);
        
        Iterator itr3 = q1.iterator();
        System.out.println("Integer Priority Queue elements");
        while(itr3.hasNext())
            System.out.print(" "+itr3.next());
        System.out.println("");
        
    }
}
