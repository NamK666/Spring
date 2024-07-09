package AutowiredPractice;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
    public void sendMail(String to, String subject, String body) {
        System.out.println("Sending email to " + to);
    }
}
