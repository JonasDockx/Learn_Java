public class DependencyInjection {
    public static void main(String[] args) {
        var service = new NotificationService(new EmailSender());
        service.alert("Hello");
    }
}

interface MessageSender { void send(String message); }

class EmailSender implements MessageSender {
    public void send(String message) { System.out.println("Email: " + message); }
}

class NotificationService {
    private final MessageSender sender;

    NotificationService(MessageSender sender) {
        this.sender = sender;
    }
    void alert(String message) {
        sender.send(message);
    }
}
