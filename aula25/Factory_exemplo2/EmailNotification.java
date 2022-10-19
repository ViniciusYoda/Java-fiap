package Factory_exemplo2;

public class EmailNotification implements Notifacation {

    @Override
    public void notifyUser() {
        System.out.println("Notificação por Email");
    }
}