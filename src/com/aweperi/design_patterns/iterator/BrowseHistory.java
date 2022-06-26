package com.aweperi.design_patterns.iterator;

public class BrowseHistory {
    private String[] urls = new String[3];
    private int count;

    void push(String url) { urls[count++] = url; }

    public String pop() {
        return urls[--count];
    }

    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
