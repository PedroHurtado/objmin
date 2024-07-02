package com.example;

public interface  Remove<T,ID> extends Get<T,ID> {
  void remove(T entity);
    
}