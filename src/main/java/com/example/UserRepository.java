package com.example;

import java.util.List;

public class UserRepository implements Get<User,String> {

 public User get(String id){
    return null;
 }

@Override
public List<User> getList() {   
   throw new UnsupportedOperationException("Unimplemented method 'getList'");
}
    
}
