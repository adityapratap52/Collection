package com.collectionpractice;

import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Class4Stack {
    public static void main(String[] args) {
        List list = new Stack();
        list.add(3);
        list.add(null);
        list.add(7);
        list.add(56);
//        System.out.println(list);

        Vector myVector = new Stack();
        myVector.addElement(6);
        myVector.addElement(null);
        myVector.addElement("Ram");
        myVector.addAll(list);
//        System.out.println(myVector);

        Stack myStack = new Stack();
        myStack.push(12);
        myStack.push(13);
        myStack.push(null);
        myStack.push(15);
        myStack.pop();
        System.out.println(myStack);

//        System.out.println(myStack.peek());
//        System.out.println(myStack.search(13));
//        System.out.println(myStack.removeElement(4));           // return boolean
        System.out.println(myStack);
    }
}
