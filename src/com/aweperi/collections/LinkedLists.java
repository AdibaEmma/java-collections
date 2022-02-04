package com.aweperi.collections;

import java.util.LinkedList;
/*
LinkedList: LinkedList class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part.
The elements are linked using pointers and addresses. Each element is known as a node. Let's understand the LinkedList with the following example:
 */
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
            for (int i = 1; i <= 5; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);

        linkedList.remove(3);
        System.out.println(linkedList);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }

        System.out.println(linkedList.getClass());
    }
}
