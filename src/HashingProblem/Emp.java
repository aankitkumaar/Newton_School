package HashingProblem;

public class Emp {
        String name;
        String gender;
        int age;

        Emp(String name,String gender,int age)
        {
            super();
            this.name = name;
            this.gender = gender;
            this.age =age;
        }

    public int getage() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getnamee() {
        return name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public void setnamee(String name) {
        this.name = name;
    }
}
