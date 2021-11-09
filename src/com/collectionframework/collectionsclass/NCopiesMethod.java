package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class NCopiesMethod {
    public static void main(String[] args) {
//        List list = Collections.nCopies(10,"Ram");
//        System.out.println(list);


        //-----------------------------------------------
        AtomicInteger ai = new AtomicInteger();
        List list = Collections.nCopies(3,ai);
        System.out.println(list);
        ai.incrementAndGet();
        System.out.println(list);
    }
}
