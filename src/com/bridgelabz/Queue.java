package com.bridgelabz;

public class Queue {
    Node head, tail;
    public Queue(){
        head = null;
        tail = null;
    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else
            tail.next = newNode;
        tail = newNode;
    }
    public int dequeue(){
        int item = head.key;
        head = head.next;
        return item;
    }
    public boolean isEmpty(){
        if (head == null)
            return true;
        else
            return false;
    }
    public int size(){
        Node temp = head;
        int i = 1;
        while(temp != tail){
            i++;
            temp = temp.next;
        }
        return i;
    }
    public void display() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.key+"->");
            temp = temp.next;
        }
        System.out.print("\n");
    }
}
