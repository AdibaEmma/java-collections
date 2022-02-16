package com.aweperi.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);
        System.out.println(list.subList(1,3));
        list.set(1,"c");
        System.out.println(list);

    }
}
