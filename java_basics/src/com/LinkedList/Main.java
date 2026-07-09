package com.LinkedList;

public class Main {
    public static void main() {
    LL list =  new LL();
    list.insertFirst(3);
    list.insertFirst(2);
    list.insertFirst(8);
    list.insertFirst(17);
    list.insertLast(99);
    list.insert(100,3);
    list.display();
    System.out.println(list.deleteFirst());
    list.display();
    System.out.println(list.deleteLast());
    list.display();
    System.out.println(list.delete(2));
    list.display();
    System.out.println(list.find(8));
      list.insertRec(88 , 2);
      list.insertLast(99);
      list.insertLast(99);
      list.insertLast(99);
      list.display();
      list.duplicates();
      list.display();


    //------------DOUBLY LINK LIST -----------------\
//        DDL list =  new DDL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(2,100);
//        list.display();

        //-----------circular list----------------
//        CircularLL list = new CircularLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//        list.display();
    }
}
