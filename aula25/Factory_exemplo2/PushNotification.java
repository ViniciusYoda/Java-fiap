package Factory_exemplo2;

public class PushNotification implements Notifacation {

    @Override
    public void notifyUser() {
        System.out.println("Notificação por Push");
    }
}