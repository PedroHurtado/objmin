package com.example.vertical.features.pizza;

import java.util.UUID;

import com.example.vertical.domain.pizza.Pizza;
import com.example.vertical.infraestructura.pizza.PizzaRepository;
import com.example.vertical.infraestructura.pizza.PizzaRepositoryImpl;

public class CreatePizza {

    public record Request(String name, String description, String url){}
    
    public record Response(UUID id,String name, String description, String url){}

    private final  UseCase useCase;

    public CreatePizza(UseCase useCase){
        this.useCase = useCase;
    }
    public Response add(Request request){
        return useCase.add(request);
    }

    public interface UseCase {
        Response add(Request request);        
    }
    public static class  UseCaseImp implements UseCase {

        private final PizzaRepository repository;
        public UseCaseImp(PizzaRepository repository){
            this.repository = repository;
        }
        @Override
        public Response add(Request request) {            
            var pizza = Pizza.create(
                    UUID.randomUUID(), 
                    request.name(), 
                    request.description(), 
                    request.url());

            repository.add(pizza);
            return new Response(pizza.getId(), pizza.getName(), pizza.getDescription(), pizza.getUrl());
        }    
        
    }
    public static CreatePizza resolver(){
        return new CreatePizza(new UseCaseImp(new PizzaRepositoryImpl()));
    }


}
