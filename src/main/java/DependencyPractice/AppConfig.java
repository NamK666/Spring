package DependencyPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 이 클래스가 Spring 설정 클래스임을 나타낸다.
public class AppConfig {
    @Bean
    public MessageService emailService(){
        return new EmailService();
    }

    @Bean
    public MessageService smsService(){
        return new EmailService();
    }

    @Bean
    public MessagePrinter messagePrinter(){
        return new MessagePrinter(emailService());
    }
}
