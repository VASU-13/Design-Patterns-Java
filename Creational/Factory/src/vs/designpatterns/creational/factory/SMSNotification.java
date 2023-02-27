package vs.designpatterns.creational.factory;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User Notify via SMS");
    }
}