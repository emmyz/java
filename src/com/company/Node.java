package com.company;

public class Node {
    public Node next;
    public int value;

    public Node(int value) {
        this.next = null;
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
