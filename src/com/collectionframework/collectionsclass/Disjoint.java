package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Disjoint {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        ArrayList<Integer>arrayList1 = new ArrayList<>();
        arrayList1.add(11);
        arrayList1.add(12);
        arrayList1.add(13);
        arrayList1.add(14);
        arrayList1.add(15);

        boolean result = Collections.disjoint(arrayList,arrayList1);
        System.out.println(result);

        arrayList1.add(30);
        boolean result1 = Collections.disjoint(arrayList,arrayList1);
        System.out.println(result1);
    }
}
