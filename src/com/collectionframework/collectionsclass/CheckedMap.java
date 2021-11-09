package com.collectionframework.collectionsclass;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CheckedMap {
    public static void main(String[] args) {
        // For String keys
//        Map<String,Integer> map = new HashMap<>();
//        Map m1 = Collections.checkedMap(map,String.class,Integer.class);
//        m1.put("A",12);
//        m1.put("B",14);
//        m1.put("C",15);
//        System.out.println(map);
//        System.out.println(m1);


        // For Integer keys
        Map<Integer,String> map1 = new HashMap<>();
        Map m2 = Collections.checkedMap(map1,Integer.class,String.class);
        m2.put(1,"C++");
        m2.put(2,"Java");
        m2.put(3,"Python");
        System.out.println(map1);
        System.out.println(m2);

        // C.C.Exception
//        Map<String,Integer> map = new HashMap<>();
//        Map m1 = Collections.checkedMap(map,String.class,Integer.class);
//        Map m2 = m1;
//        m2.put(12,"Rahim");             // ClassCastException thrown
//        System.out.println(map);
//        System.out.println(m2);
    }
}
