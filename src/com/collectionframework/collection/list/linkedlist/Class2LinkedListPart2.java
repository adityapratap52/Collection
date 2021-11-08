package com.collectionframework.collection.list.linkedlist;

import java.util.LinkedList;

public class Class2LinkedListPart2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(45);
        linkedList.add(null);
        linkedList.add(12);
        linkedList.add(4);
        linkedList.push(34);                        // It is insert value at the top of the list
        linkedList.add(12);
//        System.out.println(linkedList.pop());         // It is remove value from the of the list and return remove value or NoSuchElementException
//        System.out.println(linkedList.peek());          // It is return top the value or null
//        System.out.println(linkedList.getFirst());      // same as peek or NoSuchElementException
//        System.out.println(linkedList.getLast());
//        System.out.println(linkedList.element());                 // same as peek or NoSuchElementException
//        System.out.println(linkedList.offer(4));               // as add method, add throw IllegalStateException
//        linkedList.addFirst(47);                            // add first
//        System.out.println(linkedList.offerFirst(500));     // same as add method
//        linkedList.addLast(4);                              // add value in last throw Exception
//        System.out.println(linkedList.offerLast());             // same as addLast

        System.out.println(linkedList);
//        System.out.println(linkedList.poll());                  // Remove value at the top of list and return removed value
//        System.out.println(linkedList.peekFirst());
//        System.out.println(linkedList.peekLast());
//        System.out.println(linkedList.pollFirst());
//        System.out.println(linkedList.pollLast());
//        System.out.println(linkedList.removeFirstOccurrence(12));
//        System.out.println(linkedList.removeLastOccurrence(12));
        System.out.println(linkedList);
    }
}
