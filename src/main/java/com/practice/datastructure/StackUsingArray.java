package com.practice.datastructure;

public class StackUsingArray {

    int ar[] = new int[10];
    int i = 0;

    void push(int item) {
        ar[i++] = item;
    }

    Integer pop() {
        return ar[--i];
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
    }
}
