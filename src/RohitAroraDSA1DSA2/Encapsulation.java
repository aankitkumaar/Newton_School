package RohitAroraDSA1DSA2;

public class Encapsulation  {

    private int lockerCode;

// 1 service--------        ABC-> setSomething(int)        2nd service  (638764)
//    Encapsulation(int a){
//        this.lockerCode=a;
//    }

    // getter- get the value
    // setter - setter
    public int getLockerCode() {
        return lockerCode;
    }

    public void setLockerCode(int lockerCode) {
        this.lockerCode = lockerCode;
        // based on some logic
    }
    //this-> current object

}

class Ec1{

    public static void main(String[] args) {
        C1 c=new C1();
        c.a=7;
        Encapsulation ec=new Encapsulation();
        ec.setLockerCode(433243);
        System.out.println(ec.getLockerCode());
    }
}


// We get a better control over variables
// readonly -> getter
// writeonly -> setter


class Player
{
    private String pName;//readonly
    private int pAge;//readonly
    private String gameType;// off // read and write

    // Create a constructor and initialize the three parameters pName, pAge, and gameType.
    public Player(String pName, int pAge, String gameType)
    {
        this.pName = pName;
        this.pAge = pAge;
        this.gameType = gameType;
    }
    public String getPName()
    {
        return pName;
    }


    public int getPAge()
    {
        return pAge;
    }
    public String getGameType()
    {
        return gameType;
    }

    public void setGameType(String gameType){
        this.gameType=gameType;
    }
}
class PlayerTest
{
    public static void main(String[] args)
    {
        Player ply = new Player("Sachin", 40, "Cricket");
        String plyName = ply.getPName();
        int plyAge = ply.getPAge();
        String plyGameType = ply.getGameType();//cricket

        ply.setGameType("Football");
        plyGameType=ply.getGameType();//football

        System.out.println("Player's Name: " +plyName);
        System.out.println("Player's Age: " +plyAge);
        System.out.println("Player's Gametype: " +plyGameType);
    }
}

//

class Student
{
    private String name;
    private int phyMarks;
    private int chemMarks;
    private int bioMarks;

    public void setName(String name)
    {
        this.name = name;
    }
    public void setPhyMarks(int phyMarks)
    {
        this.phyMarks = phyMarks;
    }
    public void setChemMarks(int chemMarks)
    {
        this.chemMarks = chemMarks;
    }
    public void setBioMarks(int bioMarks)
    {
        this.bioMarks = bioMarks;
    }
    void marksRead()
    {
        System.out.println("Student's Name: " +name);
        System.out.println("Marks in Physics: " +phyMarks);
        System.out.println("Marks in Chemistry: " +chemMarks);
        System.out.println("Marks in Biology: " +bioMarks);

        int Totalmarks = phyMarks + chemMarks + bioMarks;
        float percentage = (Totalmarks * 100)/300;
        System.out.println("Percentage of PCB: " +percentage);
    }
}
class StudentMarks
{
    public static void main(String[] args)
    {
        Student st = new Student();
        st.setName("Vivek");
        st.setPhyMarks(85);
        st.setChemMarks(75);
        st.setBioMarks(90);
        st.marksRead();
    }
}

