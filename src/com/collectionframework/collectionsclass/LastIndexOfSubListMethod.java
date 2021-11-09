package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastIndexOfSubListMethod {
    public static void main(String[] args) {
        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(12);
        sourceList.add(13);
        sourceList.add(14);
        sourceList.add(15);

        List<Integer> desList = new ArrayList<>();
        desList.add(10);
        desList.add(12);
        desList.add(13);
        desList.add(14);
        desList.add(15);
        desList.add(20);
        desList.add(30);
        desList.add(40);
        desList.add(12);        // Do not change position of sublist otherwise output -1
        desList.add(13);
        desList.add(14);
        desList.add(15);

        int index = Collections.lastIndexOfSubList(desList,sourceList);
        System.out.println(index);
    }
}
