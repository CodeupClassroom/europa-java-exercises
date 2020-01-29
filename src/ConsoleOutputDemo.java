/**
 * Java I Demo code
 *      Introduction to Java
 *      Syntax, Types, and Variables
 *      Console IO
 */


public class ConsoleOutputDemo {

    public static void main(String[] args) {
        /**
         * We have already been using various properties of the System class to display information in the console,
         * System.out.println and System.out.print.
         *
         * Another method we can use is System.out.printf. This allows us to define a string with placeholders and
         * then pass values for those placeholders.
         */
        String name = "codeup";
//        System.out.printf("\n\nHello there, %s. Nice to see you.\n", name); // ?

        /**
         * You can also use multiple placeholders:
         */
//        String greeting = "Greetings and salutations";
//        System.out.printf("\n%s, %s!\n", greeting, name); // ?

        /**
         * There are many other ways to define placeholders, including special formatting for numbers, and the
         * ability to specify how much space a placeholder should take up in the output. You can read more about
         * these in the further reading section at the end of this lesson. It's not necessary to memorize all of
         * these, but rather, know that you can use this as another tool in your programming toolbox.
         */
//        double dv = 9.0192837465;
//        System.out.printf("\nString: %s, int: %d, double: %f, other double %15.9f\n",
//                "Hi", 5, dv, dv); // ?
    }
}
