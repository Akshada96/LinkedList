package com.bridgelabz;

public class Stack {
    Node head, tail;
    public Stack(){
        head = null;
        tail = null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void pop(){
        head = head.next;
    }
    public int peek(){
        return head.key;
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
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.key+"->");
            temp = temp.next;
        }
        System.out.print("\n");
    }
}
