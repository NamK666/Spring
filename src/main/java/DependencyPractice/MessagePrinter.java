package DependencyPractice;

public class MessagePrinter {
    private MessageService messageService;

    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
