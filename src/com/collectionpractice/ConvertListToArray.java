package com.collectionpractice;

import java.util.ArrayList;
import java.util.Arrays;

        //-*-*-*Convert list to array*-*-*-//

public class ConvertListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        Object []arr = list.toArray();
        int i = 0;
        int []it = new int[list.size()];
        for (Object loop:arr) {
            it[i] = (int)loop;
            i++;
        }
        System.out.println(Arrays.toString(it));

                    // --------------------OR--------------------
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(4);
//        list1.add(5);
//        list1.add(6);
//
//        Integer []integers = list1.toArray(new Integer[list1.size()]);    // toArray is work only in wrapper or generic class
//        System.out.println(Arrays.toString(integers));
    }
}
