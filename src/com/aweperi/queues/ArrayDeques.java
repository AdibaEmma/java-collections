package com.aweperi.queues;

import java.util.ArrayDeque;

/*
ArrayDeque: ArrayDeque class which is implemented in the collection framework provides us with a way to apply resizable-array.
This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.
Array dequeues have no capacity restrictions, and they grow as necessary to support usage. Let's understand ArrayDeque with an example:
 */

public class ArrayDeques {
    public static void main(String[] args) {

        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);

        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        de_que.clear();

        de_que.addFirst(564);
        de_que.addFirst(291);

        de_que.addLast(24);
        de_que.addLast(14);

        System.out.println(de_que);

        System.out.println(de_que.getLast());
        System.out.println(de_que.getFirst());
    }
}
