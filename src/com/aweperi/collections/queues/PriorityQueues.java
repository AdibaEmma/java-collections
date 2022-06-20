package com.aweperi.collections.queues;

import java.util.PriorityQueue;

/*
Priority Queue: A PriorityQueue is used when the objects are supposed to be processed based on the priority.
It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority and this class is used in these cases.
The PriorityQueue is based on the priority heap.
The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.
Let’s understand the priority queue with an example:
 */
public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(8);

        System.out.println(pQueue.peek());

        System.out.println(pQueue.poll());

        System.out.println(pQueue.peek());
    }
}
