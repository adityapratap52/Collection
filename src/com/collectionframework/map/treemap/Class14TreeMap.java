package com.collectionframework.map.treemap;

import java.util.TreeMap;

public class Class14TreeMap {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(3,"Ram");
        treeMap.put(1,"Anuj");
        treeMap.put(7,"Anuj");
        treeMap.put(5,null);
        treeMap.put(5,"Rahul");
//        treeMap.put("ID",3456);           //C.C.E
        treeMap.put(12,3456);

        treeMap.ceilingEntry(2);
        System.out.println(treeMap);

    }
}
