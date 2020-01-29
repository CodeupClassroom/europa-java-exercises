
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInputDemo {

    public static void main(String[] args) {
        /**
         * Now that we have imported it, let's take a look at an example of using the Scanner class:
         */
        Scanner scanner = new Scanner(System.in);

        // example of using Scanner with a file; try-with-resources always closes file
//        try (Scanner fScan = new Scanner(new File("myData.dat"))) {
//            // do something here
//        } catch (FileNotFoundException fnfe) {
//            System.out.println("\n\nThe file \"myData.dat\" was not found.");
//        }


        /**
         * prompt the user to type something, and use the expression scanner.next() to obtain the value the user
         * entered as a String, and store it in the variable userInput. Lastly we'll print out the value the
         * user entered.
         */
//        System.out.print("\n\nEnter something: "); // why "print" and not "println"?
//        String userInput = scanner.next(); // What happens if you enter something with spaces?
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        /**
         * Every individual entry to the scanner is called a token, and, by default, tokens are separated by
         * any whitespace.
         *
         * Allow for spaces
         */
//        System.out.print("\n\nEnter something else: ");
//        String userInput = scanner.nextLine(); // What happens if you enter something with spaces?
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        /**
         * In addition to nextLine, there are several other methods that will return the user input as a different
         * type, for example, nextInt will return the user input as type int.
         * Try with int's
         */
//        int userInt = 0;                  // Why declare this here instead of on the input line?
//        while (userInt == 0) {
//            System.out.print("\n\nEnter some integer: ");
//            try {
//                userInt = scanner.nextInt(); // What with leading spaces?
//            } catch (InputMismatchException ime) {
//                System.out.println("That is not an integer.");
//                userInt = 0;           // Why is this here?
//                scanner.nextLine();    // Why is this here?
//            }
//        }
//        System.out.println("You entered: --> \"" + userInt + "\" <--");

    }
}
