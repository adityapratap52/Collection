package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateMethod {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(15);
//        System.out.println("Normal List : "+list);
//        Collections.rotate(list,3);
//        System.out.println("Rotate List: "+list);


        //------------------------------------------------
//        Integer []integer = {11,12,13,14,15};
//        System.out.println("Normal Array: "+ Arrays.toString(integer));
//        Collections.rotate(Arrays.asList(integer),3);
//        System.out.println("Rotate List: "+Arrays.toString(integer));


        //-------------------------------------------------
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<6; i++)
            list.add(i);
        System.out.println("Normal List: "+Arrays.toString(list.toArray()));
        Collections.rotate(list,3);
        System.out.println("Rotate List: "+Arrays.toString(list.toArray()));

    }
}
