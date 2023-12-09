package pl.coderslab.beans;

public class MessageSender {
    private final NotificationService notificationService;

    public MessageSender(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendMessage() {
        notificationService.send();
    }

}
