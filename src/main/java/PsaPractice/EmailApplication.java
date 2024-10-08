package PsaPractice;

import com.example.basic.BasicApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailApplication {
    public static void main(String[] args) {

        EmailService emailService = new EmailService(new SmtpEmailSender());
        EmailService emailService1 = new EmailService(new AwsSesEmailSender());

        SpringApplication.run(BasicApplication.class, args);
    }
}
