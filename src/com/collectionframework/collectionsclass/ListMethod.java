package com.collectionframework.collectionsclass;

import java.util.*;

public class ListMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Vector vector = new Vector();
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(25);

        Enumeration e = vector.elements();
        list = Collections.list(e);
        System.out.println(list);
    }
}
