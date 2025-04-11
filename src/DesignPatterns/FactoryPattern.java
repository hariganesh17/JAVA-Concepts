package DesignPatterns;

interface Notification{
    void send();
}

class SmsNotification implements Notification{

    @Override
    public void send() {
        System.out.println("sending sms notification");
    }
}

class EmailNotification implements Notification{

    @Override
    public void send() {
        System.out.println("sending emial notification");
    }
}

class PushNotification implements Notification{

    @Override
    public void send() {
        System.out.println("sending push notification");
    }
}

class FactoryNotification{
    public static Notification createNotification(String type){
        if(type.equalsIgnoreCase("sms")){
            return new SmsNotification();
        } else if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }else if (type.equalsIgnoreCase("push")){
            return new PushNotification();
        }
        return null;
    }
}
public class FactoryPattern {
    public static void main(String[] args){
        Notification notification = FactoryNotification.createNotification("pushx");
        notification.send();
    }
}
