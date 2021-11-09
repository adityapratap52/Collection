package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(5);

        // 3- Convert Simple values in random number
        System.out.println("Normal List : "+arrayList);
        Collections.shuffle(arrayList);
        System.out.println("Random List : "+arrayList);
    }
}
