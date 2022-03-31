package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head, tail;
    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if(head == null)
            head = newNode;
        else
            tail.next = newNode;
        tail = newNode;
    }
    public void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.print(temp.key+"->");
            temp = temp.next;
        }
        System.out.println("\n");
    }
    public void push(T data){
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAfter(T prevData,T data){
        Node<T> newNode = new Node(data);
        Node<T> searchedNode = this.search(prevData);
        if( searchedNode != null){
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            //newNode.next = tempNode;
        }
    }
    public Node<T> search(T data){
        Node<T> temp = head;
        while(temp != null){
            if(temp.key == data)
                return temp;
            temp = temp.next;
        }
        return null;
    }
    public void pop(){
        head = head.next;
    }
    public void popLast(){
        Node<T> temp = head;
        Node<T> prevNode = null;
        while (temp.next != null) {
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next = null;
    }
    public void delete(T data){
        Node<T> temp = head;
        Node<T> prevNode = head;
        while(temp.key != data) {
            prevNode = temp;
            temp = temp.next;
        }
        if (temp == head)
            head = head.next;
        else
            prevNode.next = temp.next;
    }
    public void size(){
        Node<T> temp = head;
        int size = 1;
        while (temp.next != null){
            size++;
            temp = temp.next;
        }
        System.out.println("Size : "+size);
    }
}
