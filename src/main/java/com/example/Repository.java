package com.example;

public interface Repository<T,ID> extends 
Update<T,ID>,Remove<T,ID>,Add<T> {
    
}
