package IoCPractice;

import com.example.basic.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(){
        this.userRepository = new UserRepository();
    }
}
