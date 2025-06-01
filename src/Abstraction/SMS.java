package Abstraction;

public class SMS extends BaseNotification {

    @Override
    public void send() {
       System.out.println("Sending message through SMS");
    }

}
