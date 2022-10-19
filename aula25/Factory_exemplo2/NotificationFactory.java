package Factory_exemplo2;

public class NotificationFactory {
    public Notifacation createNotification(String channel) {
        if(channel == null || channel.isEmpty()) {
            return null;       
        }

        switch(channel) {
            case "SMS":
            return new SMSNotification();
            case "EMAIL":
            return new EmailNotifaction();
            case "PUSH":
            return new PushNotification();
            default:
            throw new IllegalArgumentException("Unknoow channel " + channel);
        }
    }
}
