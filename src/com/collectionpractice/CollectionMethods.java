package com.collectionpractice;

import java.util.*;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        // 1- Use of public boolean add(Object o) method of Collection interface
        collection.add("Rama");
        collection.add("Shyama");
        collection.add("Sunita");
        collection.add("Ramesh");
//        System.out.println(collection);


        // 2- Use of public boolean addAll(Collection c) method of Collection interface
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Heer");
        collection1.add("Rahul");
        collection1.add("Shyama");
        collection1.add("Aadi");

//        collection1.addAll(collection);
//        System.out.println(collection1);


        // 3- Use of void clear() method of Collection interface
//        System.out.println("Before clear List : "+collection);
//        collection.clear();
//        System.out.println("After clear List : "+collection);


        // 4- Use of public boolean contains(Object o) method of Collection interface
//        System.out.println(collection1.contains("Heer"));     // true
//        System.out.println(collection1.contains("Navin"));    // false


        // 5- Use of public boolean containsAll(Collection c) method of Collection interface
//        System.out.println(collection1.containsAll(collection));    // true
//        System.out.println(collection.containsAll(collection1));    // false


        // 6- Use of public boolean equals(Object o) method of Collection interface
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add(5);
        c2.add(new Integer(5));
//        System.out.println(c1.equals(c2));      // true
//        c2.add(8);
//        System.out.println(c1.equals(c2));      // false


        // 7- Use of int hashCode() method of Collection interface
        int val = c1.hashCode();
//        System.out.println(val);        // If same values of both collection then return same hashCode
        int val2 = c2.hashCode();
//        System.out.println(val2);

        Collection c3 = new ArrayList();
        Collection c4 = new ArrayList();
        c3.add("Ram");
        c4.add("Ram");
        int val3 = c3.hashCode();
//        System.out.println(val3);
        int val4 = c4.hashCode();
//        System.out.println(val4);


        // 8- Use of boolean isEmpty() method of Collection interface
//        System.out.println(c3.isEmpty());


        // 9- Use of iterator() method of Collection interface
        Iterator it = collection.iterator();
//        for (String name : collection)
//            System.out.println(name);


        // 10- Use of boolean remove(Object o) method of Collection interface
//        System.out.println("Before Remove element : "+collection);
//        collection.remove("Rama");
//        System.out.println("After Remove element : "+collection);


        // 11- Use of boolean removeAll(Collection c) method of Collection interface
//        System.out.println("Before remove all collection elements : "+collection1);
//        collection1.removeAll(collection);
//        System.out.println("After remove all collection elements : "+collection1);


        // 12- Use of boolean retainAll(Collection c) method of Collection interface
//        System.out.println("Before use of retainAll method");
//        System.out.println("Collection Values : "+collection);
//        System.out.println("Collection1 Values : "+collection1);
//        collection1.retainAll(collection);
//        System.out.println("After use of retainAll method");
//        System.out.println("Collection Values : "+collection);
//        System.out.println("Collection1 Values : "+collection1);


        // 13- Use of int size() method of Collection interface
//        System.out.println(collection.size());


        // 14- Use of spliterator() method of Collection interface
//        Spliterator sp  = list.spliterator();
//        System.out.println(sp.hasCharacteristics(0));
//        System.out.println(sp.hasCharacteristics(4));
//        System.out.println(sp.characteristics());
//        System.out.println(sp.estimateSize());
//        System.out.println(sp.getExactSizeIfKnown());
//        System.out.println(sp.getComparator());
    }
}
