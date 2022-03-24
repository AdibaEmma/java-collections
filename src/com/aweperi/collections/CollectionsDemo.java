package com.aweperi.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<String>();
        Collections.addAll(collection, "a", "b", "c");
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection);

        Collection<String> other = new ArrayList<>(collection);
        System.out.println(collection == other);
        System.out.println(collection.equals(other));
    }
}
