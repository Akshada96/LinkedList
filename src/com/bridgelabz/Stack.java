package com.bridgelabz;

public class Stack<T> {
    Node<T> head, tail;
    LinkedList list = new LinkedList();
    public Stack(){
        head = null;
        tail = null;
    }
    public void push(T data){
        list.push(data);
    }
    public void pop(){
        list.pop();
    }
    public T peek(){
        return head.key;
    }
    public boolean isEmpty(){
        if (head == null)
            return true;
        else
            return false;
    }
    public int size(){
        Node<T> temp = head;
        int i = 1;
        while(temp != tail){
            i++;
            temp = temp.next;
        }
        return i;
    }
    public void display(){
        list.display();
    }
}
