package Abstraction;

public abstract class BaseNotification implements NotificationChannel{
        
     public void log (String message){
        System.out.println("There is some logs:" + message);
     }

}
