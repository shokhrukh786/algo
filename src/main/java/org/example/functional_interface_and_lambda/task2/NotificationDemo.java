package org.example.functional_interface_and_lambda.task2;

public class NotificationDemo {
    public static void main(String[] args) {
        NotificationManager manager = new NotificationManager();

        Notification smsNotification = new Notification(NotificationType.SMS, "Tizimgabam kerdingiz!");
        Notification emailNotification = new Notification(NotificationType.EMAIL, "kod: 123212");
        Notification smsNotification2 = new Notification(NotificationType.SMS, "Tizimdan chiqdingiz!");

        manager.registerHandler(NotificationType.SMS, (notification
                -> System.out.println(notification.getType() + " : " + notification.getMessage())));
        manager.registerHandler(NotificationType.EMAIL, notification
                -> System.out.println(notification.getType() + " : " + notification.getMessage()));

        manager.registerFilter((notification -> notification.getMessage().toLowerCase().contains("bam")));
        manager.registerFilter((notification -> notification.getMessage().length() >= 50));

        manager.registerCorrectors(n -> new Notification(n.getType(), n.getMessage() + " Meta Comp."));

        manager.sendNotification(smsNotification);
        manager.sendNotification(emailNotification);
        manager.sendNotification(smsNotification2);
        manager.sendNotification(smsNotification);
    }
}
