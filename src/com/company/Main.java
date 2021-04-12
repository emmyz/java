package com.company;

import java.util.*;

public class Main {

    public static void main(String args[]){
        Linked list = new Linked();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.displayList(list);
        System.out.println("LinkList size is "+list.listSize());

        System.out.println("Testing next node: ");
        System.out.println(list.hasNextNode());//true
        Node next = list.nextNode();
        System.out.println(next.value);
        System.out.println(list.nextNode().value);
        System.out.println(list.hasNextNode());//false
        System.out.println(list.nextNode().value);
        System.out.println(list.nextNode().value);
        System.out.println(list.nextNode().value);

        System.out.println("Testing deleteNode");
        list.deleteNode(2);
        list.displayList(list);

        list.insertNode(4);
        list.insertNode(2);
        list.displayList(list);
        list.deleteNode(4);
        list.displayList(list);
        list.deleteNode(1);
        list.displayList(list);
        System.out.println("LinkList size is "+list.listSize());

    }


}
