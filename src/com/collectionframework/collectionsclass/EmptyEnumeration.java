package com.collectionframework.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class EmptyEnumeration {
    public static void main(String[] args) {
        Enumeration<String> e = Collections.emptyEnumeration();
        boolean output = e.hasMoreElements();
        System.out.println("Output : "+output);
    }
}
