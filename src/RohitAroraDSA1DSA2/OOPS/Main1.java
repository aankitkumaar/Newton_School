package BatchMarch.OOPS;

      public class Main1 {
        int modelYear;
        String modelName;

        public Main1(int year, String name) {
            modelYear = year;
            modelName = name;
        }

        public static void main(String[] args) {
            Main1 myCar = new Main1(1969, "Mustang");
            System.out.println(myCar.modelYear + " " + myCar.modelName);
        }
    }