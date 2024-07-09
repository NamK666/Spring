package AutowiredPractice;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private EmailService emailService;

    public void registerUser(User user) {
        emailService.sendMail("이남경","제목","내용");
    }
}
