package com.kunal;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(4);
        stack.push(45);
        stack.push(34);
        stack.push(12);
        stack.push(78);
        stack.push(65);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
