package com.example;

public interface  Update<T,ID> extends Get<T,ID> {
    void update(T entity);    
}