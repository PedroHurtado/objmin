package com.example;

import java.util.List;

public class CustomerRepository  implements Repository<Customer,Integer>{

    @Override
    public void update(Customer entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Customer get(Integer id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void remove(Customer entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void add(Customer entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public List<Customer> getList() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getList'");
    }

    
    
}
