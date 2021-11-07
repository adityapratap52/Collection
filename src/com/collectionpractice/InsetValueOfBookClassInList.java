package com.collectionpractice;

import java.util.ArrayList;
import java.util.List;

class Book{
    int id;
    String name,branch;
    int salary;

    Book(int id, String name, String branch, int salary){
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.salary = salary;
    }
}

public class InsetValueOfBookClassInList {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Book book1,book2,book3;
        book1 = new Book(12,"Aadi","Programmer",200000);
        book2 = new Book(14,"Rahul","Engineer",100000);
        book3 = new Book(16,"Akhil","Checker",50000);

        list.add(book1);
        list.add(book2);
        list.add(book3);
        for (Book b : list)
        System.out.println(b.id+" "+b.name+" "+b.branch+" "+b.salary);
    }
}
