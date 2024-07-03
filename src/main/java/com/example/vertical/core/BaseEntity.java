package com.example.vertical.core;

import java.util.UUID;

public abstract class BaseEntity {
    private final UUID id;
    public UUID getId() {
        return id;
    }
    public BaseEntity(UUID id){
        this.id = id;
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BaseEntity b){
            return b.id.equals(this.id);
        }
        return false;
    }
    
}
