package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheckedList {
    public static void main(String[] args) {

        //--------------For Integer value-----------------
//        List<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(5);
//        System.out.println(list);
//
//        List<Integer> integerList = Collections.checkedList(list,Integer.class);
//        System.out.println(integerList);

        //-----------------For String Value------------------
//        List<String> list1 = new ArrayList<>();
//        list1.add("Ram");
//        list1.add("Shyam");
//        System.out.println(list1);
//
//        List<String> stringList = Collections.checkedList(list1,String.class);
//        System.out.println(stringList);

        //---------------ClassCastException-----------------------
        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(6);
        System.out.println(list3);

        //-------------------------------------------------------------
//        List l = Collections.checkedList(list3,Integer.class);
//        l.add(7);
//        System.out.println(list3);
//        System.out.println(l);
//
//        l.add("Rahul");
//        System.out.println(l);

                        //-----------OR----------
        List l1 = list3;
        l1.add(50);
        l1.add("Ram");                  // It is not throws any Exception
        System.out.println(list3);
        System.out.println(l1);
        //-------------------------------------------------------------
    }
}
