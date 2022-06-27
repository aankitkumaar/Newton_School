package BatchMarch;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification(User user) {
        System.out.println("Sending email to "+ user.email);
    }
}
