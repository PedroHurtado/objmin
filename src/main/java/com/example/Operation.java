package com.example;

//Una interfaz con un solo metodo es una interface funcional
//la lambda es la implementacion instancia de la interface
// (a,b)->a+b
//https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
public interface Operation<T> {
    T apply(T a, T b);    
} 