package com.collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class UseIOfRemoveIf {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(7);
        list.add(8);
        list.add(21);
        list.add(29);

        // 1- for Integer value
        list.removeIf(n -> (n%3==0));
//        for(Integer value : list)
//            System.out.println(value);



        List<String> list1 = new ArrayList<>();
        list1.add("Rama");
        list1.add("Anuj");
        list1.add("Pavan");
        list1.add("Ravi");
        list1.add("Aakash");
        list1.add("ramesh");

        // 2- for String value
        list1.removeIf(n -> n.charAt(0) == 'R' || n.charAt(0) == 'r');
//        for(String name : list1)
//            System.out.println(name);



        // 3- If you insert null value then it throws nullPointerException
//        List<Integer>list2 = null;
//        list2.removeIf(n -> n%5 == 0);
//        for (Integer value : list2)
//            System.out.println(value);

                //------*OR*------//
        list1.removeIf(null);
    }
}
