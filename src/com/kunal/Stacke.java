package com.kunal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stacke {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
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

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);
        queue.add(1);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        System.out.println(queue.remove());

    }
}
