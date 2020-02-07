package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        // setup grades application
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = Student.seedData();
        final int PRESET_OPTION_COUNT = 4;


        // loop to choose how thw list the movies
        int choice = 1;
        do {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("\t0 - exit");
            System.out.println("\t1 - The class average");
            System.out.println("\t2 - All Student grades");
            System.out.println("\t3 - Get all Student Averages in a CVS format");

            // loop through students to show repos
            int index = PRESET_OPTION_COUNT;
            String[] indexArray = new String[students.size() + PRESET_OPTION_COUNT];
            for (String repo : students.keySet()) {
                indexArray[index] = repo;
                System.out.println("\t" + index + " - " + repo);
                index++;
            }
            System.out.println("");
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("That is an invalid response");
//                continue;
                break;
            }

            // loop to display student information
            if (choice != 0) {
                if (choice == 1) {
                    System.out.printf("\nThe class average: %6.2f\n", Student.getClassAverage(students));
                } else if (choice == 2) {
                    for (int i = PRESET_OPTION_COUNT; i < indexArray.length; i++) {
                        System.out.printf("github information: %s\n%s\n", indexArray[i], students.get(indexArray[i]));
                    }
                    System.out.printf("The class average: %6.2f\n", Student.getClassAverage(students));
                } else if (choice == 3) {
                    System.out.printf("\nCSV Format\n%s", Student.getCSV(students));
                } else if (choice >= indexArray.length) {
                    System.out.println("That is an invalid response");
                } else {
                    System.out.printf("github information: %s\n%s\n", indexArray[choice], students.get(indexArray[choice]));
                }
            }

        } while (choice != 0);
        System.out.println("Goodbye");
    }
}
