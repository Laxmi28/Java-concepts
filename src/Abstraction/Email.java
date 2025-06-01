package Abstraction;

public class Email extends BaseNotification {

    @Override
    public void send() {
       System.out.println("Sending message through email");
    }

}
