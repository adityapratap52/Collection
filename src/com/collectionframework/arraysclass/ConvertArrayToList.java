package com.collectionframework.arraysclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String []array = {"Ram","Shyam","Sita"};
        System.out.println("Array Values :"+Arrays.toString(array));
        for(String value : array){
            list.add(value);
        }
        System.out.println("List Values : "+list);
    }
}
