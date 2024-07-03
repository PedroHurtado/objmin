package com.example.vertical.features.pizza;

import java.util.List;
import java.util.UUID;

import com.example.vertical.domain.pizza.Ingredient;
import com.example.vertical.domain.pizza.Pizza;

//Controlador
public class CreatePizza {

    public record Request(String name, String description, String url) {
    }

    public record Response(
            UUID id,
            String name,
            String description,
            String url, Double price,
            List<Ingredient> ingredients) {
    }

    private final UseCase useCase;

    public CreatePizza(UseCase useCase) {
        this.useCase = useCase;
    }

    public Response add(Request request) {
        return useCase.add(request);
    }

    // UseCase
    private interface UseCase {
        Response add(Request request);
    }

    private static class UseCaseImp implements UseCase {
        private final Repository repository;

        public UseCaseImp(Repository repository) {
            this.repository = repository;
        }

        @Override
        public Response add(Request request) {
            // Logger
            // Validation
            // Transaction
            var pizza = Pizza.create(
                    UUID.randomUUID(),
                    request.name(),
                    request.description(),
                    request.url());

            repository.add(pizza);
            
            return new Response(
                    pizza.getId(),
                    pizza.getName(),
                    pizza.getDescription(),
                    pizza.getUrl(),
                    pizza.getPrice(),
                    pizza.getIngredients());
        }

    }

    public static CreatePizza resolver() {
        return new CreatePizza(new UseCaseImp(new RepositoryImp()));
    }

    // Repository
    private interface Repository {
        void add(Pizza pizza);
    }

    private static class RepositoryImp implements Repository {

        @Override
        public void add(Pizza pizza) {

        }

    }
}
