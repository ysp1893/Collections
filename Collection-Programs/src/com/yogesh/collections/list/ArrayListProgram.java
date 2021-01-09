/*
 * It uses a dynamic array to store the duplicate element of different data types.
 * ArrayList class maintains the insertion order and is non-synchronized.
 * The elements stored in the ArrayList class can be randomly accessed
 */
package com.yogesh.collections.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Yogesh
 */
public class ArrayListProgram {
    
    public static void main(String[] args) {
        /*
        * We can declare ArrayList using 2 types
        */
        // 1st simple ArrayList class
        ArrayList<String> arrList = new ArrayList<String>();
        // 2st simple List interface
        List list = new ArrayList<String>();
        // This is not a type, in java 7 diamond operator introduced
        // Diamond operator is to simplify instantiation of generic classes
        List<String> nList = new ArrayList<>();
        
        //Using simple Arraylist Class
        arrList.add("Mitansh");
        arrList.add("Yogesh");
        arrList.add("Jagdish");
        System.out.println("Before delete any object from arrList variable");
        Iterator itr = arrList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        arrList.remove("Yogesh");
        System.out.println("After remove Yogesh from arrList");
        for (Iterator<String> it = arrList.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        
        arrList.add(1, "Kalpesh");
        System.out.println("After Add Kalpesh at 2nd poisition in arrList");
        for (Iterator<String> iterator = arrList.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        
    }
}
