package vs.designpatterns.creational.factory;

public class Main {
	public static void main(String[] args) {
	       NotificationFactory notificationFactory = new NotificationFactory();
	       Notification notification = notificationFactory.createNotification("sms");
	       notification.notifyUser();
	    }

}
