package com.bridgelabz;

public class MainClass {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
    }
}
