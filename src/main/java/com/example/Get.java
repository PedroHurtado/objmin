package com.example;

//https://www.baeldung.com/java-static-default-methods
public interface  Get<T,ID> extends MemoryList<T>{
    T get(ID id);
    /*default T get(ID id){
        //getList().stream().filter(null).toList();
    }*/
}