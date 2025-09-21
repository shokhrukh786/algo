package org.example.functional_interface_and_lambda.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NotificationManager {
    private final Map<NotificationType, Consumer<Notification>> notificationHandlers = new HashMap<>();
    private final List<Predicate<Notification>> filters = new ArrayList<>();
    private final List<Function<Notification, Notification>> correctors = new ArrayList<>();

    public void registerHandler(NotificationType type, Consumer<Notification> handler) {
        notificationHandlers.put(type, handler);
    }

    public void registerFilter(Predicate<Notification> filter) {
        filters.add(filter);
    }
    
    public void registerCorrectors(Function<Notification, Notification> corrector){
        correctors.add(corrector);
    }

    public void sendNotification(Notification notification) {
        for (Predicate<Notification> filter : filters) {
            //xabar bloklanadi "bam" so'zi bo'lsa.
            if (filter.test(notification)) {
                System.out.println("\uD83D\uDEAB Xabar bloklandi: " + notification.getMessage());
                return;
            }
        }
        for (Function<Notification, Notification> corrector : correctors){
            notification = corrector.apply(notification);
        }
        Consumer<Notification> notificationConsumer = notificationHandlers.get(notification.getType());
        if (notificationConsumer == null) {
            System.out.println("❌ Ushbu turdagi bildirishnoma uchun handler topilmadi: " + notification.getType());
        } else {
            notificationConsumer.accept(notification);
        }
    }


}

