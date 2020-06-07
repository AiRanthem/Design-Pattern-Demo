package com.learn.Iterator;

public class AggreateIterator implements Iterator {
    private final Aggregate aggregate;
    private int index;

    public AggreateIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < aggregate.getLength();
    }

    @Override
    public Book next() {
        if(hasNext()) {
            return aggregate.get(index++);
        }
        else {
            return null;
        }
    }
}
