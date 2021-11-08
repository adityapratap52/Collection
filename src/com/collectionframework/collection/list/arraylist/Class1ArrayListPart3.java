package com.collectionframework.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;

class SortValue implements Comparator{
    public int compare(Object a1, Object a2){
        Integer firstValue = (Integer)a1;
        Integer secondValue = (Integer)a2;
        return firstValue.compareTo(secondValue);
    }
}

public class Class1ArrayListPart3 {
    public static void main(String[] args) {
        ArrayList myArrayList = new ArrayList(15);
        ArrayList myArrayList1 = new ArrayList();
        myArrayList1.add(30);
        myArrayList1.add(50);
        myArrayList1.add(40);
        myArrayList.add(3);
        myArrayList.add(1);
        myArrayList.add(5);
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(45);
        myArrayList.addAll(myArrayList1);

//        System.out.println(myArrayList);
//        myArrayList.sort(new SortValue());
//        System.out.println(myArrayList);

//        myArrayList.ensureCapacity(100);                                  // ArrayList can now surely store upto 100 elements.

//        myArrayList.trimToSize();                                         // trims the capacity of an ArrayList

//        System.out.println("Index of 1 in beginning : "+myArrayList.indexOf(1));
//        System.out.println("Index of 1 at last : "+myArrayList.lastIndexOf(1));

//        System.out.println(myArrayList.contains(0));                          //true
//        System.out.println(myArrayList.contains(50));                         // false
        System.out.println(myArrayList.containsAll(myArrayList1));              // false

//        System.out.println(myArrayList.isEmpty());                            // true

//        System.out.println(myArrayList.size());                               // 6

//        System.out.println(myArrayList.stream().max(new SortValue()));        // 45
//        System.out.println(myArrayList.stream().min(new SortValue()));        // 0

//        System.out.println(myArrayList.subList(2,6));                       // 2 include and  exclude

//        System.out.println(myArrayList.stream().count());                    // It is same as size


        /* if you delete any value in arrayList or myArrayList then
         * arrayList1 automatically remove that particular value
         * bcz arrayList1 refer to arrayList
         */
//        ArrayList arrayList =(ArrayList) myArrayList.clone();            // clone is used for clone value without instantiate arrayList
//        arrayList.add(345);

//        ArrayList arrayList1 = arrayList;
//        arrayList1.addAll(arrayList);

//        arrayList.remove((Integer)5);
//        System.out.println(arrayList);

    }
}
