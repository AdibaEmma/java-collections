package com.aweperi;

import java.util.Iterator;
import java.util.Stack;
/*
ArrayList: ArrayList provides us with dynamic arrays in Java.
Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection.
Java ArrayList allows us to randomly access the list. ArrayList can not be used for primitive types, like int, char, etc. We will need a wrapper class for such cases.
Let's understand the arraylist with the following example:


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
