package com.example.basic;

import org.springframework.stereotype.Repository;

// UserRepositor가 IoC컨테이너에 올라간 것.
@Repository
public class UserRepository implements UserRepositoryInterface {

    @Override
    public void save(User user) {
        System.out.println("User saved");
    }
    @Override
    public void delete(User user) {
        System.out.println("User deleted");
    }
}
