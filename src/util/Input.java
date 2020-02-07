package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return getString("Enter a string: ");
    }

    public String getString(String prompt) {
        String answer;
        System.out.println(prompt);
        answer = this.scanner.next();
        return answer;
    }

    public boolean yesNo(){
        return yesNo("What is your answer? (yes/no): ");
    }

    public boolean yesNo(String prompt){
        String answer;
        System.out.println(prompt);
        answer = this.scanner.next();
        return answer.toLowerCase().startsWith("y");
    }

    public int getInt(int min, int max) {
        return getInt("Enter an integer betweeen " + min + " and " + max +": ",min,max);
    }

    public int getInt(String prompt, int min, int max) {
        int answer = Integer.MIN_VALUE;
        do {
            System.out.println(prompt);
            String response = this.scanner.nextLine();
            try {
                answer = Integer.valueOf(response);
            } catch (NumberFormatException nfe) {

            }
        } while (answer == Integer.MIN_VALUE || answer < min || answer > max);
        return answer;
    }

    public int getInt() {
        return getInt("Enter an integer: ");
    }

    public int getInt(String prompt) {
        int answer = Integer.MIN_VALUE;
        do {
            System.out.println(prompt);

            String response = this.scanner.nextLine();
            try {
                answer = Integer.valueOf(response);
            } catch (NumberFormatException nfe) {
//                System.out.println("Error");
            }
        } while (answer == Integer.MIN_VALUE);
//        answer = this.scanner.nextInt();
        return answer;
    }

    public double getDouble(double min, double max) {
        return getDouble("Enter a double betweeen " + min + " and " + max +": ",min,max);
    }

    public double getDouble(String prompt, double min, double max) {
        double answer = 0;
        boolean success = false;
        do {
            System.out.println(prompt);
            String response = this.scanner.nextLine();
            try {
                answer = Double.valueOf(response);
                success = true;
            } catch (NumberFormatException nfe) {
                success = false;
            }
//            answer = this.scanner.nextDouble();
        } while (!success || answer < min || answer > max);
        return answer;
    }

    public double getDouble() {
        return getDouble("Enter a double: ");
    }

    public double getDouble(String prompt) {
        double answer = 0;
        boolean success = false;
        do {
            System.out.println(prompt);
            String response = this.scanner.nextLine();
            try {
                answer = Double.valueOf(response);
                success = true;
            } catch (NumberFormatException nfe) {

            }
        } while (!success);
        return answer;
    }

}
