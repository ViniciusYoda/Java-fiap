package Factory_exemplo2;

public class NotificationService {

    public static void main(String[] args ) {

        NotifactionFactory nf = new NotifactionFactory();
        Notification n = nf.createNotifaction("SMS");
        n.notifyUser();
    }
    
}