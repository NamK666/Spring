package com.example.basic;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository2 implements UserRepositoryInterface {

    @Override
    public void save(User user) {
        System.out.println("User2 saved");
    }
    @Override
    public void delete(User user) {
        System.out.println("User2 deleted");
    }
}
