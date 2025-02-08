package Collections.listImplementation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Vectordemp {
    public static void main(String[] args) {
        Vector<Integer> example = new Vector<>(12,3);

        /* vector is a thread safe synchronized thread safe and its capacity can be increaaed expliclty by default
         * it is 10 initially but you can pass it in the constructor it increases by by double time of its capacity
         * and it uses dynamic array to save data
         */

         System.out.println(example.capacity());
         
         LinkedList<Integer> exLinkedList = new LinkedList<>();
         Vector<Integer> exVectorq = new Vector<>(exLinkedList);

         Vector<Integer> exVector = new Vector<>(Arrays.asList(1,23,45));


         exVector.add(78);
         exVector.size();
         exVector.clear();

         exVector.clone();

         System.out.println(exVector);



    }

}
