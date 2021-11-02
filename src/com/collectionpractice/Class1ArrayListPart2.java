package com.collectionpractice;

import java.util.ArrayList;

public class Class1ArrayListPart2 {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(34);
        myArrayList.add(67);
        myArrayList.add(9);
        myArrayList.add(41);

        //---------------remove Method----------------------
//        System.out.println(myArrayList.get(1));        // It is return specific value
//        System.out.println(myArrayList.get(4));      // IndexOutOfBoundException


        //-----------------Use Of replaceAll, toLowerCase and toUpperCase method------------
        ArrayList<String> myArrayList1 = new ArrayList<>();
        myArrayList1.add("Ram");
        myArrayList1.add("SEETA");
        myArrayList1.add("Ansumaan");
        myArrayList1.add("Yamraj");

//        System.out.println("Normal Values : "+myArrayList1);
//        myArrayList1.replaceAll( e -> e.toLowerCase() );
//        System.out.println("lower case values : "+myArrayList1);
//        myArrayList1.replaceAll( e -> e.toUpperCase());
//        System.out.println("UPPER CASE VALUE : "+ myArrayList1);

        //---------------------set method---------------------------------
//        System.out.println(myArrayList);
//        myArrayList.set(2,400);
//        System.out.println(myArrayList);

        //-------------------clear method---------------------------------
//        myArrayList.clear();
//        System.out.println(myArrayList);            // It is print null array
    }
}
