

import java.util.Scanner;

public class ControlDoLoop {

    public static void main (String[] args) {

        // a prime example of using 'Do'
        Scanner scanner = new Scanner(System.in);
        String userData = "";                     // Why declare this here?
        do {
            // enter number
            System.out.print("\nEnter an integer: ");
            userData = scanner.nextLine();
            int num = 0;
            if (userData.length() != 0) {
                num = Integer.parseInt(userData);

                // test number
                if (ControlWhileLoop.isPrime(num)) {
                    System.out.println(num + " is a prime number.");
                } else {
                    System.out.println(num + " is not prime.");
                }
            } // move this

        } while (userData.length() != 0); // notice that you end with a simi-colon
    }
}
