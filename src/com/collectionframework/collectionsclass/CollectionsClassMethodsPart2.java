package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsClassMethodsPart2 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);

        // 1- checkedCollection method
        Collection col = Collections.checkedCollection(arrayList,Integer.class);
//        System.out.println("Integer Values : "+col);

                //-------OR----------//
//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1.add("Ram");
//        arrayList1.add("Shyam");
//        arrayList1.add("Raman");
//        arrayList1.add("Aditya");
//        Collection col2 = Collections.checkedCollection(arrayList1,String.class);
//        System.out.println("String Values : "+col2);

                //---------OR---------//
        ArrayList<String>arrayList2 = new ArrayList<>();
        Collection con3 = Collections.checkedCollection(arrayList2,String.class);
//        arrayList2.add("Ram");
//        arrayList2.add("Asmit");
        con3.add("Ramesh");
        con3.add("Anuj");
        System.out.println(arrayList2);
//        Collection con4 = con3;
//        System.out.println(con4);
//        con4.add(5);                        // C.C.Exception
//        System.out.println(con4);
    }
}
