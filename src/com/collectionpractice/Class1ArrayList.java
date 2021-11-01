package com.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class Class1ArrayList {
    public static void main(String[] args) {
        List<Integer> myList1 = new ArrayList<>(20);
        myList1.add(4);
        myList1.add(45);
        myList1.add(89);
        myList1.add(2);
        System.out.println(myList1);
        List<Integer> myList2 = new ArrayList<>(myList1);
        System.out.println(myList1.get(1));     // It is return specific value
        System.out.println(myList1.get(4));      // IndexOutOfBoundException
        System.out.println(myList2);
    }
}
