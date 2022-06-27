public class Encapculation {
    private int lockercode;

    public int getLockercode() {
        return lockercode;
    }

    public void setLockercode(int lockercode) {
        this.lockercode = lockercode;
    }
}
class Ec1
{
    public static void main(String[] args) {
        Encapculation ob=new Encapculation();
        ob.setLockercode(41);
        System.out.println(ob.getLockercode());
    }
}
