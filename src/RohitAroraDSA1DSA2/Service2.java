package BatchMarch;

public class Service2 {

    public static void main(String[] args) {

        User user=new User("rohit@gmail.com",8232412,2341221,"Rohit");

        EmailNotification em=new EmailNotification();
        em.sendNotification(user);

        PhoneNotification ph=new PhoneNotification();
        ph.sendNotification(user);
    }
}
