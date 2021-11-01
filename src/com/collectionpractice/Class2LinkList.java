package com.collectionpractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class2LinkList {
    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<>();
        myList.add(5);
        myList.add(58);
        myList.add(89);
        myList.add(1);
        myList.add(4);
        System.out.println(myList.indexOf(4));
        System.out.println(myList.indexOf(6));          // return -1 bcz 6 is not present in this list

        Iterator<Integer> iterateMyList = myList.iterator();
        while (iterateMyList.hasNext()){
            int value = iterateMyList.next();
            System.out.println(value);
        }
    }
}
