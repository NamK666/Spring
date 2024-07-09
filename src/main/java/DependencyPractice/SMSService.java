package DependencyPractice;

public class SMSService implements MessageService {
    @Override
    public String getMessage() {
        return "SMS 메시지입니다.";
    }
}
