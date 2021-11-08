package com.collectionframework.collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class2LinkedListPart1 {
    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<>();
        List<Integer> myList1 = new LinkedList<>();
        myList.add(5);
        myList.add(58);
        myList.add(89);
        myList.add(1);
        myList.add(4);
        System.out.println(myList);
        myList1.addAll(myList);

        System.out.println(myList.indexOf(4));              // return particular index of 4
        System.out.println(myList.indexOf(6));          // return -1 bcz 6 is not present in this list
        System.out.println(myList.contains(4));
        System.out.println(myList.isEmpty());
        System.out.println(myList.size());
        System.out.println(myList.equals(myList1));         // you can use any value inside equals
        System.out.println(myList.get(3));

        Iterator<Integer> iterateMyList = myList.iterator();
        while (iterateMyList.hasNext()){
            int value = iterateMyList.next();
            System.out.println(value);
        }
    }
}
