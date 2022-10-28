package com.aweperi.design_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
//    private String[] urls = new String[3];
    private List<String> urls = new ArrayList<String>();
    private int count;

    void push(String url) { urls.add(url); count++; }

    public String pop() {
        return urls.remove(--count);
    }

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }

//    public class ArrayIterator implements Iterator<String> {
//        private BrowseHistory history;
//        private int index;
//
//        public ArrayIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.count);
//        }
//
//        @Override
//        public String current() {
//            return history.urls[index];
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }

    public class ListIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
