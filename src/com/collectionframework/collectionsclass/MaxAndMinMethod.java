package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAndMinMethod {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(3);
        list.add(23);
        list.add(-30);
        list.add(31);

        System.out.println("Max Value in List : "+ Collections.max(list));      //Collections.max(list,null)
        System.out.println("Min Value in List : "+ Collections.min(list));
        System.out.println(Collections.max(list,Collections.reverseOrder()));
    }
}
