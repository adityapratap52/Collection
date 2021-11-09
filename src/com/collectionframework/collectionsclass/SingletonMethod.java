package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingletonMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,12,13,14,15,12,10,30);
        System.out.println(list);

        list.remove(6);
        System.out.println(list);

        list.removeAll(Collections.singleton(12));
        System.out.println(list);
    }
}
