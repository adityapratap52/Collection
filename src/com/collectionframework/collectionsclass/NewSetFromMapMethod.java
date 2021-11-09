package com.collectionframework.collectionsclass;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NewSetFromMapMethod {
    public static void main(String[] args) {

        // For Integer
//        Map<Integer, Boolean> map = new HashMap<>();
//        Set<Integer> set = Collections.newSetFromMap(map);
//        set.add(12);
//        set.add(13);
//        set.add(14);
//
//        System.out.println(set);
//        System.out.println(map);

        // For String
//        Map<String, Boolean> map = new HashMap<>();
//        Set<String> set = Collections.newSetFromMap(map);
//        set.add("Ram");
//        set.add("Vikas");
//        set.add("Prabhat");
//
//        System.out.println(set);
//        System.out.println(map);

        Set set = Collections.newSetFromMap(new HashMap<>());
        System.out.println(set);
        set.add(2);
        set.add("Sani");
        set.add(null);

        System.out.println(set);
    }
}
