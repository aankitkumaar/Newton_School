package BatchMarch;

public class PhoneNotification implements Notification{
    @Override
    public void sendNotification(User user) {
        System.out.println("Sending email to "+ user.phoneNo);
    }
}
