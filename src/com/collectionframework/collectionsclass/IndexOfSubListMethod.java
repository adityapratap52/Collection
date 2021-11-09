package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IndexOfSubListMethod {
    public static void main(String[] args) {
//        List<Integer> sourceList = new ArrayList<>();
//        sourceList.add(12);
//        sourceList.add(13);
//        sourceList.add(14);
//        sourceList.add(15);
//
//        List<Integer> desList = new ArrayList<>();
//        desList.add(10);
//        desList.add(12);
//        desList.add(13);
//        desList.add(14);
//        desList.add(15);
//        desList.add(20);
//        desList.add(30);
//        desList.add(40);
//        desList.add(12);
//        desList.add(13);
//        desList.add(14);
//        desList.add(15);
//
//        int index = Collections.indexOfSubList(desList,sourceList);
//        System.out.println(index);


        //-------------------------------------------------------------------------------------
//        List<Integer> sourceList = new ArrayList<>();
//        sourceList.add(12);
//        sourceList.add(13);
//        sourceList.add(14);
//        sourceList.add(15);
//
//        List<Integer> desList = new ArrayList<>();
//        desList.add(10);
//        desList.add(20);
//        desList.add(30);
//        desList.add(40);
//        desList.add(12);
//        desList.add(13);
//        desList.add(14);        // if sourceList is not sublist of desList then output -1

//        int index = Collections.indexOfSubList(desList,sourceList);
//        System.out.println(index);


        //-----------------------------------------------------------------
//        List<String> desList = Arrays.asList("This is my car".split(" "));
//        System.out.println(desList);
//
//        List<String> sourceList = Arrays.asList("is my car".split(" "));
//        int index = Collections.indexOfSubList(desList,sourceList);
//        System.out.println(index);


        //-----------------------------------------------------------------
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(13);
        list2.add(14);

        List list3 = new ArrayList();
        list3.add("Ram");
        list3.add("Aadi");
        list3.add("Aadi");
        int index = Collections.indexOfSubList(list3,list2);        // -1
        System.out.println(index);
    }
}
