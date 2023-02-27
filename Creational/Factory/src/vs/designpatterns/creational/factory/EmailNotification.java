package vs.designpatterns.creational.factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User Notify via Email");
    }
}