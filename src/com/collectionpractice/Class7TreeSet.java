package com.collectionpractice;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Class7TreeSet {
    public static void main(String[] args) {
        SortedSet mySet = new TreeSet();
        mySet.add(5);
        mySet.add(45);
//        mySet.add(null);                          // null not allow or NullPointerException
//        mySet.add("Ram");                           // not allow heterogeneous or ClassCastException
        mySet.add(200);
        mySet.add(890);
        mySet.add(40);
//        System.out.println(mySet.headSet(45));          // 5
//        System.out.println(mySet.tailSet(45));          // 45,200,890
//        System.out.println(mySet.subSet(40,200));           //starting value(include), ending value(exclude)
//        System.out.println(mySet.first());                  // return beginning value
//        System.out.println(mySet.last());                      // return last value
//        System.out.println(mySet.remove(200));
//        System.out.println(mySet);

        NavigableSet mySet1 = new TreeSet();
        mySet1.add(12);
        mySet1.add(13);
        mySet1.add(14);
        mySet1.add(15);
        mySet1.add(17);
        mySet1.add(18);
//        System.out.println(mySet1);
//        System.out.println(mySet1.pollFirst());         // return removing value
//        System.out.println(mySet1.pollLast());
//        System.out.println(mySet1);

//        System.out.println(mySet1.ceiling(17));         // 17<= -> 17
//        System.out.println(mySet1.floor(17));           // 17>= -> 17
//        System.out.println(mySet1.higher(17));          // 17<  ->18
//        System.out.println(mySet1.lower(17));           // 17 > ->15
    }
}
