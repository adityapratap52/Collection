package com.collectionpractice;

import java.util.LinkedHashSet;

public class Class6LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet mySet = new LinkedHashSet();
        mySet.add(64);
        mySet.add(45);
        mySet.add(1);
        mySet.add(67);
        mySet.add(68);
        mySet.add(69);
        mySet.add("Ram");               // heterogeneous value is allowed
        mySet.add(null);            // null value is allowed
        mySet.add(70);                // Insertion order preserved
        mySet.add(71);
        mySet.add(72);
        System.out.println(mySet);
    }
}
