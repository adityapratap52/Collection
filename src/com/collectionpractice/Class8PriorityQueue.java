package com.collectionpractice;

import java.util.PriorityQueue;
import java.util.Queue;

public class Class8PriorityQueue {
    public static void main(String[] args) {
        Queue myQueue = new PriorityQueue();
        myQueue.add(34);
        myQueue.offer(12);
        myQueue.add(32);                        // Insertion order is not preserved
        myQueue.add(34);                      // Duplicate value allow
//        myQueue.add(null);                // null value in not allow or NullPointerException
//        myQueue.add("Ram");               // Heterogeneous value not allow
        myQueue.add(4);
        myQueue.add(14);
        myQueue.add(0);

//        System.out.println(myQueue.peek());           // It is return top of the value or null
//        System.out.println(myQueue.element());          // It is same as element or NoSuchElementException

//        System.out.println(myQueue.poll());       // It is remove top of the value and return removed value
//        System.out.println(myQueue.remove());     // It is same as poll method or NoSuchElementException

        System.out.println(myQueue);
    }
}
