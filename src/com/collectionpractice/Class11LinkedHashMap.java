package com.collectionpractice;

import java.util.LinkedHashMap;

public class Class11LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1,"Ram");
        linkedHashMap.put(2,"Rahul");
        linkedHashMap.put(3,"Aditya");
        linkedHashMap.put(4,"Prabhat");
        linkedHashMap.put(null,null);
        linkedHashMap.put("ID",898989);

        System.out.println(linkedHashMap.containsValue("Aditya"));
        System.out.println(linkedHashMap.containsValue("Aadi"));
        System.out.println(linkedHashMap.entrySet());
        System.out.println(linkedHashMap.values());
        System.out.println(linkedHashMap.keySet());
        System.out.println(linkedHashMap.containsKey(3));
        System.out.println(linkedHashMap);
    }
}
