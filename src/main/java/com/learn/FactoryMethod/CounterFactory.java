package com.learn.FactoryMethod;

import java.util.HashMap;

public class CounterFactory implements Factory {
    HashMap<Integer, Counter> counters = new HashMap<>(10);
    @Override
    public Counter getCounter(int id) {
        Counter counter = counters.get(id);
        if(counter == null){
            counter = new Counter(id);
            counters.put(id, counter);
        }
        return counter;
    }
}
