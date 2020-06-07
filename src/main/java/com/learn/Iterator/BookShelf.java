package com.learn.Iterator;

public class BookShelf implements Aggregate {
    private final Book[] books;
    private int last = 0;
    private final int size;

    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
        this.size = maxsize;
    }
    public Book get(int index){
        return books[index];
    }
    public boolean appendBook(Book book){
        if(last >= size){
            return false;
        }
        this.books[last] = book;
        last ++;
        return true;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator getIterator() {
        return new AggreateIterator(this);
    }
}
