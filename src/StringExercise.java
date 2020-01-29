/**
 * Exercises
 *
 * String Basics.
 */


import java.util.Scanner;

public class StringExercise {

    // main method for String exercises
    public static void main(String[] args) {
        StringExercise se = new StringExercise();
//        se.ex01();
        se.talkToBob();
    }

    /**
     * For each of the following output examples: create a String variable that contains the
     * desired output and print it out to the console, you can do this with only one String
     * variable and one print statement for each output example.
     *
     * We don't need no thought control
     *
     * Check "this" out!, "s inside of "s!
     *
     * In windows, the main drive is usually C:\
     *
     * I can do backslashes \, double backslashes \\,
     * and the amazing triple backslash \\\!
     */
    public void ex01() {
        String string = new String();
        string = "We don't need no thought control\n";
        System.out.println(string);
        string = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(string);
        string = "In windows, the main drive is usually C:\\\n";
        System.out.println(string);
        string = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";
        System.out.println(string);
    }

    /**
     * Create a class named Bob with a main method for the following exercise.
     *
     * Bob is a lackadaisical teenager. In conversation, his responses are very limited.
     *
     * Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
     * He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
     * He says 'Fine. Be that way!' if you address him without actually saying anything.
     * (empty input)
     *
     * He answers 'Whatever.' to anything else.
     *
     * Write the Java code necessary so that a user of your command line application can
     * have a conversation with Bob.
     */
    public void talkToBob() {
        String textMessage = "";
        Scanner s = new Scanner(System.in);
        System.out.printf("\n\nBob is in. You can message him.\n");
        while (true) {
            System.out.print("\nType text to Bob: ");
            textMessage = s.nextLine();

            // empty text
            if (textMessage == null || textMessage.length() == 0) {
                System.out.println("Fine. Be that way!");
                continue;
            }
            if (textMessage.equals("Bye.")) {
                break;
            }

            // convert to letter
            char c = textMessage.charAt(textMessage.length()-1);
            switch (c) {
                case '?':
                    System.out.println("Sure.");
                    break;
                case '!':
                    System.out.println("Whoa, chill out!");
                    break;
                default:
                    System.out.println("Whatever.");
                    break;
            }

        } while (textMessage.charAt(0) == 'y');
        System.out.printf("\n\nGoodbye\n\n");
        s.close();
    }
}
