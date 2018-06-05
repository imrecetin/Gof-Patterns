package com.designpatterns.behavioral.iterator.example1;

public interface ProfileIterator<T> {
    
    public boolean hasNext();

    public T getNext();

    public void reset();
}
