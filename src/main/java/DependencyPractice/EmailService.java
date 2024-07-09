package DependencyPractice;

public class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "이메일 메시지입니다.";
    }
}
