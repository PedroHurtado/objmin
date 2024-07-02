package com.example;

/*public class Foo {
    public String name;
}*/

//https://projectlombok.org/
public class Foo{
    private String name;  //atributo(todos deben de ser privados)
    public Foo(String name){ //constructor
        this.name= name;
    }
    //Solo lectura
    public String getName(){  //getter
        return name;
    }
    public void setName(String value){ //setter
        //void un metodo que no devuelve nada
        name = value;
    }
    @Override
    public boolean equals(Object obj) {

        
        if(obj instanceof Foo){
            Foo foo = (Foo)obj;
            return foo.getName().equals(this.getName()); 
        }
        return false;      
    }

}
