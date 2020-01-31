public class Europa {
    public static void something(String[] args) {
            int num = 7;
        System.out.println("Yada yada!");
    }
    public static void main(String[] args) {
        int num = 7;
        System.out.print("Hello World!");
        System.out.print("\n");

        byte num1 = -127;
        short num2 = num1;
        int num3 = num2;
        long num4 = num3;

        int bigNum1 = 127;
        byte bigNum2 = (byte) bigNum1;
        bigNum2++;
        System.out.println(bigNum2);
//        int num4;


        float num5 = 3.333f;
        double num6 = 3.141592;
        int closeToNum6 = (int) num6;
//        System.out.println(num6);
        final double PI = 3.141592;
//        pi = 7;

        boolean yesNo = true;
        yesNo = false;

        char initial;
        initial = 'D';
        initial = '\n';

        String name = "Daniel";
        name.length();

//        System.out.println(num4);

        Student trant = new Student("Trant");
        trant.program = "Web Development";
        trant.cohort = "Deimos";
        trant.location = "San Antonio";
//        trant.startDate = new Date();
        trant.drinksCoffee = false;
        trant.report();


        Car tesla = new Car("Tesla", "Model S", 2019);
        System.out.println(tesla.startYourEngine("forgot"));
        for (int i = 0;i<100;i++)
            System.out.println(tesla.drive());
        System.out.println(tesla.mileage);
    }
}
