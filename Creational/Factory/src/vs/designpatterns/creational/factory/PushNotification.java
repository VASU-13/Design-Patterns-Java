package vs.designpatterns.creational.factory;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User Notify via Push");
    }
}