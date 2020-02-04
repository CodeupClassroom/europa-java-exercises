import java.util.Date;

public class Student {
    static int numberOfStudents = 0;
    public String name;
    String cohort;
    private Date startDate;
    String program;
    String location;
    public boolean drinksCoffee;

    public static void main(String[] args) {
        Student daniel = new Student("Daniel");
//        daniel.name = "Daniel";
        daniel.cohort = "Europa";
        daniel.startDate = new Date("06/11/2018");
        daniel.program = "Web Development";
        daniel.location = "San Antonio";
        daniel.drinksCoffee = true;


        Student zach = new Student("Zach");
//        zach.name = "Zach";
        zach.cohort = "Bayes";
        zach.startDate = new Date("February 11, 2017");
        zach.program = "Data Science";
        zach.location = "San Antonio";
        zach.drinksCoffee = false;


        daniel.report();
        zach.report();
        System.out.printf("There are now %d students.\n", numberOfStudents);
//        if (zach.drinksCoffee)
//            System.out.println(zach.name + " drinks coffee.");
    }

    public Student(String name) {
        numberOfStudents++;
        this.name = name;
        this.drinksCoffee = true;
        this.startDate = new Date();
    }

    public void report() {
        String output = "";
        output += "My name is " + this.name +". ";
        output += "I started learning " + this.program + " with " + this.cohort + " on " + this.startDate + ". ";
        if (this.drinksCoffee)
            output += "I drink coffee in " + this.location + ".";
        else
            output += "I don't drink coffee in " + this.location + ".";
        System.out.println( output);
    }

}
