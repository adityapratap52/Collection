package com.collectionframework.collectionsclass;

import java.util.*;

public class FrequencyMethod {
    public static void main(String[] args) {
//        List list1 = new ArrayList();
//        list1.add(1);
//        list1.add(4);
//        list1.add(7);
//        list1.add(1);
//        list1.add("Ram");
//        list1.add(4);
//        list1.add(1);
//        list1.add("Ram");
//        System.out.println(list1);

//        System.out.println("Frequency of 1 : "+Collections.frequency(list1,1));
//        System.out.println("Frequency of 7 : "+Collections.frequency(list1,7));
//        System.out.println("Frequency of Ram : "+Collections.frequency(list1,"Ram"));

//        Set mySet = new HashSet(list1);
//        for (Object value : mySet)
//            System.out.println("Frequency of "+value+" : "+Collections.frequency(list1,value));

        //----------------------------------------------------
        Integer []arr = {1,12,45,78,1,4,12};

        int frq = Collections.frequency(Arrays.asList(arr),1);      // 2
//        int frq1 = Collections.frequency(Arrays.asList(arr),11);     // 0
        System.out.println("Frequency of 1 : "+frq);
    }
}
