package com.collectionpractice;

import java.util.HashMap;

public class Class10HashMap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(4,"Abhay");
        hashMap.put(1,"Rahul");                 // Insertion order is not preserved
        hashMap.put(null,"Abhay");              // null key is allowed
        hashMap.put(null,"Shyam");              // override value of duplicate key
        hashMap.put("RollNo",12345);            // heterogeneous key is allowed

//        System.out.println(hashMap.get(1));
//        System.out.println(hashMap.putIfAbsent(1,"Ravi"));  // if key is not present then insert Ravi otherwise return presented value of key
//        System.out.println(hashMap.values());
//        System.out.println(hashMap.keySet());
//        System.out.println(hashMap.entrySet());
//        System.out.println(hashMap.getOrDefault(2,"Ramaji"));  // if key present in Map then return particular value otherwise return Ramaji
//        System.out.println(hashMap.replace(1,"Rahulji"));       // replace value of the particular key


        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        hashMap.put(i1,"Ram");
        hashMap.put(i2,"Shyam");
        System.out.println(hashMap);
    }
}
