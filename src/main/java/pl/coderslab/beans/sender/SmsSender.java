package pl.coderslab.beans.sender;

import pl.coderslab.beans.NotificationService;

public class SmsSender implements NotificationService {
    @Override
    public void send() {
        System.out.println("Juz klikam w telefon panie szefie");
    }
}
