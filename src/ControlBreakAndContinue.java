

import java.util.Scanner;

public class ControlBreakAndContinue {

    public static void main(String[] args) {

//        // Bad integer input
//        Scanner scanner = new Scanner(System.in);
//        int num = 0;
//        int badAttempts = 0;
//        while (true) {
//
//            // enter number
//            System.out.print("\nEnter an integer (0 to end): ");
//            try {
//                num = scanner.nextInt();
//            } catch (Exception e) {
//                ++badAttempts;
//                if (badAttempts == 1) {
//                    System.out.println("This is not an integer");
//                    scanner.nextLine();
//                    continue;
//                } else if (badAttempts == 2) {
//                    System.out.println("This is also not a an integer");
//                    scanner.nextLine();
//                    continue;
//                } else {
//                    System.out.println("You have a malfunction between your keyboard and your chair.");
//                    scanner.nextLine();
//                    break;
//                }
//            }
//
//            // test number
//            if (num == 0) break;
//            if (ControlWhileLoop.isPrime(num)) {
//                System.out.println(num + " is a prime number.");
//            } else {
//                System.out.println(num + " is not prime.");
//            }
//        }
//        scanner.close();

        /**
         * Testing nested breaks
         *
         * What will print?
         */
//        System.out.println("Start");
//        for (int i=0; i < 5; i++) {
//            System.out.println(i);
//            middleloop:
//            for (int j=0; j < 5; j++) {
//                System.out.println("\t" + j);
//                for (int k = 0; k < 5; ++k) {
//                    System.out.println("\t\t" + k);
//                    if (k == i) break middleloop;
//                }
//            }
//        }
//        System.out.println("Done");

        /**
         * Testing nested continues
         *
         * What will print?
         */
        System.out.println("Start");
        for (int i=0; i < 5; i++) {
            System.out.println(i);
            middleloop:
            for (int j=0; j < 5; j++) {
                System.out.println("\t" + j);
                for (int k = 0; k < 5; ++k) {
                    System.out.println("\t\t" + k);
                    if (k == j) continue middleloop;
                }
            }
        }
        System.out.println("Done");
    }
}
