package com.bridgelabz;

public class SortedLinkedList<T extends Comparable> {
    Node<T> head, tail;
    public void add(T data){
        Node<T> newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            Node<T> temp = head;
            Node<T> prevNode = head;
            if (head.key.compareTo(data) > 0){
                    newNode.next = head;
                    head = newNode;
                }
            else {
                while (temp.key.compareTo(data) < 0 && temp.next != null){
                    prevNode = temp;
                    temp = temp.next;
                }
                if (temp.equals(tail)){
                    if (temp.key.compareTo(data) < 0){
                     temp.next = newNode;
                     tail = newNode;
                    }
                    else {
                        newNode.next = temp;
                        prevNode.next = newNode;
                    }
                }
                else {
                    newNode.next = temp;
                    prevNode.next = newNode;
                }
            }
        }
    }
    public void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.print(temp.key+"->");
            temp = temp.next;
        }
        System.out.println("\n");
    }
}
