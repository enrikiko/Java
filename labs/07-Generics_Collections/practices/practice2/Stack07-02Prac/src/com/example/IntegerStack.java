package com.example;

import java.util.ArrayDeque;
import java.util.Deque;



public class IntegerStack {
    
    public static void main(String[] arg){
    IntegerStack stack = new IntegerStack();
    stack.push(3);
    stack.push(2);
    stack.push(1);
    stack.push(9);
    stack.print();
    stack.pop();
    stack.print();
    System.out.println(stack.peek());
    }

    private Deque<Integer> data = new ArrayDeque<Integer>();

    public void push (Integer i){
    data.addFirst(i);
    }
    
    public void pop () {data.removeFirst();}
    
    public Integer peek () {
    return data.peekFirst();
    }
    
    public void print(){
        data.forEach(p->System.out.println(p));
        
        System.out.println("------------------------");
    }
    
}
