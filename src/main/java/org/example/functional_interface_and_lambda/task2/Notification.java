package org.example.functional_interface_and_lambda.task2;

public class Notification {
    private final NotificationType type;
    private final String message;

    public Notification(NotificationType type, String message){
        this.type = type;
        this.message = message;
    }

    public NotificationType getType(){
        return type;
    }

    public String getMessage(){
        return message;
    }
}
