package pl.coderslab;

import pl.coderslab.beans.MessageSender;
import pl.coderslab.beans.sender.PigeonSender;

public class MainWithoutInjectionTest {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender(new PigeonSender());

        messageSender.sendMessage();

    }
}
