package com.samunyberg.iterator;

public interface Iterator<T> {
    boolean hasNext();

    T current();

    void next();

}
