package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.example.paint.AddRunDto;
import com.example.paint.AppPaintImpl;
import com.example.paint.Configuration;
import com.example.paint.Point;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Consumer<String> print = (str)->{};

        var paint=AppPaintImpl.builder()
            //.setCanvas(Configuration.createCanvas(System.out::println))
            .setCanvas(Configuration.createCanvas(str->{}))
            .setColors(Configuration.createColors())
            .setCommnads(Configuration.createCommands())
            .setShapes(Configuration.createShapes())
            .build();

        /*var builder = AppPaintImpl.builder();
        builder.setCanvas(null);
        builder.setColors(null);
        builder.setCommnads(null);
        builder.setShapes(null);
        var paint = builder.build();*/

        paint.run(new AddRunDto("add", 
                    "cuadrado", "black", 
                    new Point(10,10), new Point(100,100)));

        System.out.println(Math.PI);
        //Math.PI = 4; error
        
        //var a=1;
        //a="Hola";
        List<Operation<Integer>> operations = new ArrayList<>();
        
        operations.add((a,b)->a+b);
        operations.add((a,b)->a-b);
        operations.add((a,b)->a*b);
        operations.add((a,b)->a/b);

        /*for (Operation<Integer> operation : operations) {
            
        }*/
        for (var operation : operations) {
            var result = operation.apply(4, 2);
            System.out.println(result);
        }
        //Get<User,String> userrepository = new UserRepository();
        //userrepository.get(null);

        //Add<Customer> customerRepositoy = new CustomerRepository();
        //customerRepositoy.add(null);
        
        //List<String> strings  = new ArrayList<>();
        //List<Integer> integers = new ArrayList<>();
        //Customer customer = new Customer();
        //customer.add()
        //customer.get();
        //customer.update();
        //customer.remove();

        //User user = new User();
        //user.get();

        App.PrintAveNoVoladora(new Pinguino(5), System.out::println);
        App.PrintAveVoladora(new Aguila(10,100), System.out::println);
        
        /*Foo foo = new Foo("Pedro");
        foo.setName("Pedro Hurtado");
        System.out.println(foo.getName());
        
        System.out.println( "Hello World!" );*/
        
    }

    public static void PrintAveVoladora(AveVoladora aveVoladora, Consumer<Object> printer){
        printer.accept(aveVoladora.toString());
    }

    public static void PrintAveNoVoladora(AveNoVoladora aveNoVoladora,Consumer<Object> printer){
        printer.accept(aveNoVoladora);
    }
}
