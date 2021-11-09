package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollectionMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Collection<Integer> l = Collections.unmodifiableCollection(list);
        list.add(2);
        l.add(3);               // throw UnsupportedOperationException
        System.out.println(list);
        System.out.println(l);
    }
}
