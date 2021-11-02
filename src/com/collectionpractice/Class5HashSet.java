package com.collectionpractice;

import java.util.HashSet;
import java.util.Set;

public class Class5HashSet {
    public static void main(String[] args) {
        Set mySet = new HashSet();
        mySet.add(12);
        mySet.add(1);                               // Insertion order is not preserved
        mySet.add(null);                            // null value is allowed
        mySet.add("Ram");                           // heterogeneous value is allowed
        mySet.add(145);
        System.out.println(mySet.add(145));
        mySet.add(4);
        System.out.println(mySet);
    }
}
