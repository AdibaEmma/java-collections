package com.aweperi;

import java.util.Iterator;
import java.util.Stack;

/*
Stack: Stack class models and implements the Stack data structure.
The class is based on the basic principle of last-in-first-out.
In addition to the basic push and pop operations, the class provides three more functions of empty, search and peek.
The class can also be referred to as the subclass of Vector. Let’s understand the stack with an example:
 */
public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");

        for (String s : stack) System.out.print(s + " ");

        System.out.println();

        stack.pop();
        for (String s : stack) System.out.print(s + " ");

    }
}
