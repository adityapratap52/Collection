package com.collectionpractice;

import java.util.List;
import java.util.Vector;

public class Class3Vector {
    public static void main(String[] args) {
        List myList = new Vector();
        myList.add(5);
        myList.add(91);
        myList.add(null);
        myList.add("Ram");
        myList.add(89);
        myList.add(67);
        myList.add(2,67);
        System.out.println(myList);

        Vector myVector = new Vector();
        myVector.addElement(4);
        myVector.addElement(null);
        myVector.addElement("Arun");
        myVector.addElement(45);
        System.out.println(myVector);
    }
}
