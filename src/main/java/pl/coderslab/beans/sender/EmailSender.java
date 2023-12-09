package pl.coderslab.beans.sender;

import pl.coderslab.beans.NotificationService;

public class EmailSender implements NotificationService {
    @Override
    public void send() {
        System.out.println("Leci email prosze Panstwa");
    }
}
