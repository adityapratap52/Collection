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


        // 3- asLifoQueue(Deque<T> deque)  method
//        Deque<Integer>deque = new ArrayDeque<>();
//        deque.add(23);
//        deque.add(24);
//        deque.add(25);
//        System.out.println(deque);

//        Queue queue = deque;          // If you use this process then It is always insert value at the last

//        Queue queue = Collections.asLifoQueue(deque);       // It is insert value in beginning

//        queue.add(40);
//        queue.add(50);
//        System.out.println(queue);


        // 4- binarySearch(List l, T key);
//        Collections.sort(arrayList);
//        System.out.println(Collections.binarySearch(arrayList,7));

        //--------OR--------//
//        Collections.sort(arrayList,new MyComparator());
//        System.out.println(Collections.binarySearch(arrayList,7));

        //--------OR--------//
//        ArrayList arrayList1 = new ArrayList();
//        arrayList1.add(10);
//        arrayList1.add(-20);
//        arrayList1.add(30);
//        arrayList1.add(40);
//        arrayList1.add(-50);
//        Collections.reverseOrder();
//        int index = Collections.binarySearch(arrayList1,40);
//        System.out.println("Index of -50 : "+index);

        // Convert Simple values in random number
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
