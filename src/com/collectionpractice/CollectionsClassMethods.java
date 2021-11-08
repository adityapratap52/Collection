package com.collectionpractice;

import java.util.*;

class MyComparator implements Comparator {
    public int compare(Object o1, Object o2){
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        return i1.compareTo(i2);
    }
}

public class CollectionsClassMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(5);

        // sort method
//        System.out.println("Before Sorting : "+arrayList);
//        Collections.sort(arrayList);
                //----OR----//
//        Collections.sort(arrayList,new MyComparator());
//        System.out.println("Before Sorting : "+arrayList);


        // addAll method
//        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        Collections.addAll(arrayList1,12,34,13,56);
//        System.out.println(arrayList1);

        Deque<Integer>deque = new ArrayDeque<>();
        deque.add(23);
        deque.add(24);
        deque.add(25);
        System.out.println(deque);
        System.out.println(Collections.asLifoQueue(deque));
    }
}
