package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CheckedCollection {
    public static void main(String[] args) {

        // checkedCollection method

        //----------------For Integer Object values------------------------
//        Collection<Integer>arrayList = new ArrayList<>();
//        arrayList.add(12);
//        arrayList.add(13);
//        arrayList.add(14);
//        arrayList.add(15);
//        arrayList.add(16);
//
//        Collection col = Collections.checkedCollection(arrayList,Integer.class);
//        System.out.println("Integer Values : "+col);

                //--------------String Object values------------------------
//        Collection<String> arrayList1 = new ArrayList<>();
//        arrayList1.add("Ram");
//        arrayList1.add("Shyam");
//        arrayList1.add("Raman");
//        arrayList1.add("Aditya");
//        Collection col2 = Collections.checkedCollection(arrayList1,String.class);
//        System.out.println("String Values : "+col2);

                //-----------------------ClassCastException-----------------------//
        Collection<String>arrayList2 = new ArrayList<>();
        Collection con3 = Collections.checkedCollection(arrayList2,String.class);
        arrayList2.add("Ram");            // con3.add("Ram); is same
        arrayList2.add("Asmit");          // con3.add("Asmit"); is same
        System.out.println(arrayList2);

        Collection con4 = con3;
        System.out.println(con4);
        con4.add(5);                        // C.C.Exception
        System.out.println(con4);
    }
}
