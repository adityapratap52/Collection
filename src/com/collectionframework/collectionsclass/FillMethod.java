package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FillMethod {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("Ram");
        list1.add("Anuj");
        list1.add("Anubhav");
        list1.add("Rahul");
        System.out.println(list1);
        Collections.fill(list1,"Hello");
        System.out.println(list1);

                    //----------OR--------------//
//        List list2 = Arrays.asList(1,2,3,4,5);
//        System.out.println("Before Replace values : "+list2);
//        Collections.fill(list2,121);
//        System.out.println("After Replacing : "+list2);

                    //--------------OR------------//
//        List list3 = new ArrayList();
//        for (int i=1; i<11; i++)
//            list3.add(i);
//        System.out.println(list3);
//        Collections.fill(list3,"Ram");
//        System.out.println(list3);
    }
}
