package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();         // IndexOutOfBoundException -> if index is greater then size
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println(list);

        Collections.swap(list,1,3);
        System.out.println(list);
    }
}
