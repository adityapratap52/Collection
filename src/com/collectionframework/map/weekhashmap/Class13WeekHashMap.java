package com.collectionframework.map.weekhashmap;

import java.util.HashMap;

class Temp{
    public String toString(){return "temp";}
    public void finalize(){
        System.out.println("This is finalize method");
    }
}

public class Class13WeekHashMap {
    public static void main(String[] args) throws InterruptedException{
        HashMap hashMap = new HashMap();
        Temp t = new Temp();
        hashMap.put(t,"Rahul");
        t = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(hashMap);

//        WeakHashMap hashMap1 = new WeakHashMap();
//        Temp t = new Temp();
//        hashMap1.put(t,"Rahul");
//        t = null;
//        System.gc();
//        Thread.sleep(1000);
//        System.out.println(hashMap1);
    }
}
