package com.collectionpractice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Class9PriorityBlockingQueue {
    public static void main(String[] args) throws InterruptedException{
        BlockingQueue myQueue = new PriorityBlockingQueue();
        myQueue.put(5);
        myQueue.add(576);
        myQueue.put(7);
        myQueue.add(57);
        myQueue.add(27);            //Insertion order is not preserved
//        myQueue.add(null);          // null not allow
//        myQueue.add("Ram");           // heterogeneous not allow

//        System.out.println(myQueue.take());     // Retrieves and removes the head of this queue, waiting if necessary until an element becomes available.
        PriorityBlockingQueue myQueue1 = new PriorityBlockingQueue();
        myQueue1.add(3);
        myQueue1.add(30);
        myQueue1.add(57);
        myQueue.addAll(myQueue1);

//        System.out.println(myQueue1);

        LinkedBlockingQueue myQueue2 = new LinkedBlockingQueue();
        System.out.println(myQueue2.remainingCapacity());
        myQueue2.add(34);
        myQueue2.add(44);
        myQueue2.add(4);
        myQueue2.add(14);
        System.out.println(myQueue2.remainingCapacity());
        System.out.println(myQueue2);
    }
}
