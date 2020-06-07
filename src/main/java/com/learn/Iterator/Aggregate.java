package com.learn.Iterator;

public interface Aggregate {
    Iterator getIterator();
    int getLength();
    Book get(int index);
}
