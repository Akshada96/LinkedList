package com.bridgelabz;

public class Queue<T> {
    Node<T> head, tail;
    LinkedList list = new LinkedList();
    public Queue(){
        head = null;
        tail = null;
    }
    public void enqueue(T data){
        list.add(data);
    }
    public void dequeue(){
        list.pop();
    }
    public boolean isEmpty(){
        if (head == null)
            return true;
        else
            return false;
    }
    public void size(){
        list.size();
    }
    public void display() {
        list.display();
    }
}
