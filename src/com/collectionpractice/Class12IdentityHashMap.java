package com.collectionpractice;

import java.util.IdentityHashMap;

public class Class12IdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        identityHashMap.put(5,"Aditya");
        identityHashMap.put(5,"Aditya");
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        identityHashMap.put(i1,"Aditya");
        identityHashMap.put(i2,"Aditya");
        System.out.println(identityHashMap);
    }
}
