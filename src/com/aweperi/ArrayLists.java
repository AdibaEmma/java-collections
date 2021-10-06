package com.aweperi;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i =1; i <= 5; i++)
            al.add(i);

        System.out.println(al);

        al.remove(3);

        System.out.println(al);

        for (int i = 0; i < al.size(); i++)
        System.out.print(al.get(i) + " ");
    }


}
