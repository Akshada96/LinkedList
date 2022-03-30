package com.bridgelabz;

public class MainClass {
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(70);
        s.push(30);
        s.push(56);
        s.display();
        while (!s.isEmpty()){
            System.out.println("Top item of stack is "+s.peek());
            s.pop();
            System.out.println("After pop");
            s.display();
        }
    }
}
