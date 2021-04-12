package com.company;

import java.util.NoSuchElementException;

public class Linked {
    private Node head = null;
    private Node current;

    public void insertNode(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            current = head;
        }else{
            Node temp = head;
            //loop through the end
            while(temp.next!=null){
                temp = temp.next;
            }
            //temp.next is null, insert behind next node
            temp.next = node;
        }
    }

    public void deleteNode(int value){
        //if at head, then delete head and set head to the second node
        if(head!=null && head.value==value){
            head = head.next;
            return;
        }
        Node temp = head;
        Node prevNode = null;
        while(temp!=null){
            //record previous node
            if(temp.value!=value){
                prevNode=temp;
                temp = temp.next;
            }else{
                prevNode.next = temp.next;
                System.out.println("Node with value "+value+" deleted");
                return;
            }

        }
    }

    public int listSize(){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public boolean hasNextNode(){
        if(current.next!=null){
            return true;
        }
        return false;
    }

    public Node nextNode(){
        Node next;
        if(current.next!=null){
            next = current.next;
            current = current.next;
        }else{
            //throw exception
            System.out.println("Reach end of linked list, setting next to head");
            current=head;
            next = current;

//            throw new NoSuchElementException("Reach end of LinkedList, no next node");

        }
        return next;
    }

    public void displayList(Linked list){
        Node temp = list.head;
        if(temp==null){
            System.out.println("LinkedList is empty, nothing to display.");
            return;
        }
        System.out.print("LinkedList with values: ");
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println(" ");
    }




}
