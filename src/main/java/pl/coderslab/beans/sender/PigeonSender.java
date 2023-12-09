package pl.coderslab.beans.sender;

import pl.coderslab.beans.NotificationService;

public class PigeonSender implements NotificationService {
    @Override
    public void send() {
        System.out.println("Golab leci fru fru fru");
    }
}
