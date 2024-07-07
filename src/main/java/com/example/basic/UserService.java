package com.example.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service 애노테이션을 통해 UserService가 IoC컨테이너에 올라갔음.
@Service
public class UserService {

    private UserRepositoryInterface userRepository;

    @Autowired
    public UserService(UserRepositoryInterface userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    //userRepository한테 delete를 실행하라고 넘겨주는 것
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
