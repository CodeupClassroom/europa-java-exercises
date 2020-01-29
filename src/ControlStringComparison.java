

import java.util.Scanner;

public class ControlStringComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nContinue? [y/N] ");
        String userInput = sc.next();

        // Don't do this!
        boolean confirmation = (userInput == "y");

        // Assuming the user inputs "y", what will this print?
        if (!confirmation) {
            System.out.println("\ndis-continuing");
        } else {
            System.out.println("\nContinuing");
        }

        // Assuming the user inputs "y", what will this print?
        confirmation = userInput.equals("y");
        if (!confirmation) {
            System.out.println("\ndis-continuing");
        } else {
            System.out.println("\nContinuing");
        }
    }
}
