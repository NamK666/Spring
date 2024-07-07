package IoCPractice;

import com.example.basic.UserRepository;

public class UserServiceIOC {
    private final UserRepository userRepository;

    public UserServiceIOC(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
