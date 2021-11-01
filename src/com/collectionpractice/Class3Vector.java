package com.collectionpractice;

import java.util.List;
import java.util.Vector;

public class Class3Vector {
    public static void main(String[] args) {
        List<Integer> myList = new Vector<>();
        myList.add(5);
        myList.add(91);
        myList.add(12);
        myList.add(89);
        myList.add(67);
        myList.add(2,67);
        System.out.println(myList);
    }
}
