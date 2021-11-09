package com.collectionframework.collectionsclass;

import java.util.*;

class MyComparator implements Comparator {
    public int compare(Object o1, Object o2){
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        return i1.compareTo(i2);
    }
}

public class SortAndAddAll {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(5);

        // 1- sort method
//        System.out.println("Before Sorting : "+arrayList);
//        Collections.sort(arrayList);
                //----OR----//
//        Collections.sort(arrayList,new MyComparator());
//        System.out.println("Before Sorting : "+arrayList);


        // 2- addAll method
//        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        boolean result = Collections.addAll(arrayList1,12,34,13,56);
//        System.out.println("Boolean Result : "+result);
//        System.out.println("List Values : "+arrayList1);
    }
}
