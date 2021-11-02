package com.collectionpractice;

import java.util.ArrayList;
import java.util.List;

// Use of add,addAll,remove,removeAll,retainAll method

public class Class1ArrayListPart1 {
    public static void main(String[] args) {
        List myList1 = new ArrayList();

        //---------------add Method----------------------
        myList1.add(4);                                            // add value in insertion order
        myList1.add(new Integer(45));                      // Unnecessary boxing 'new Integer(45) not throw error
        myList1.add(89);
        myList1.add(2,2);                       //  It is insert value at the specific index
        myList1.add(null);                                    // null value is allow in All list Class or Collection and Map
        myList1.add(89);                                    // Duplicate value is allow
        myList1.add("Rama");                               // Heterogeneous value is allow
//        System.out.println(myList1);

        //---------------addAll Method----------------------
        List myList2 = new ArrayList();               // You can add list in constructor
        myList2.add(34);
        myList2.add(67);
        myList2.add(9);
        myList2.add(41);
        myList2.add(4);
//        List<Integer> myList2 = new ArrayList<>();                      // You can add list through addAll method
//        myList2.addAll(myList1);
//        myList2.addAll(2,myList1);
//        System.out.println(myList1);

        //---------------remove Method----------------------
//        myList1.remove(2);                                    // It is remove value through index
//        myList1.remove(new Integer(2));                      // It is remove value through Object
//        myList2.remove((Integer)67);                         // It is same as the object of Integer
//        myList1.remove(null);                                 //  It is remove null value
//        myList1.remove("Rama");                             //  It is remove String value
//        myList1.remove(new String("Rama"));           //  It is remove String value, new String is redundant but not throw error

        //---------------removeAll Method----------------------
//        System.out.println("Before Remove List : "+myList2);
//        myList2.removeAll(myList1);
//        System.out.println("After Remove List : "+myList2);

        //-------------retainAll method means Intersection----------------------
        System.out.println(myList2);
        myList2.retainAll(myList1);
        System.out.println(myList2);
                //------and---//
        System.out.println(myList1);
        myList1.retainAll(myList2);
        System.out.println(myList1);
    }
}
