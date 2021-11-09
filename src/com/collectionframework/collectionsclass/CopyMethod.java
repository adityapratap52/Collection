package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;

public class CopyMethod {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>(5);
        ArrayList<Integer> arrayList1 = new ArrayList<>(10);

        // arrayList1 >= arrayList
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(25);
        arrayList.add(35);
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(40);
        arrayList1.add(50);
        arrayList1.add(60);
        System.out.println(arrayList);
        Collections.copy(arrayList1,arrayList);
        System.out.println(arrayList1);

        // arrayList1 < arrayList --> IndexOutOfBoundException
//        ArrayList<Integer>arrayList = new ArrayList<>(5);
//        ArrayList<Integer> arrayList1 = new ArrayList<>(10);
//        arrayList.add(5);
//        arrayList.add(15);
//        arrayList.add(25);
//        arrayList.add(35);
//        arrayList1.add(10);
//        arrayList1.add(20);
//        arrayList1.add(30);
//
//        Collections.copy(arrayList1,arrayList);
//        System.out.println(arrayList);
    }
}
