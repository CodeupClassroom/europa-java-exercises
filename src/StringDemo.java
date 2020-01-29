

public class StringDemo {

    public static void main(String[] args) {

        // print leading blank lines
        System.out.println("\n");

        // demo concatenation
//        String message = "Hello";
//        String s = "Hello";
//        System.out.println(message); // prints "Hello"
//        message = message + " World!";
//        System.out.println(message); // prints "Hello, World!"

        // Demo comparisons
//        String input = "Codeup Rocks!";
//
//        System.out.println();
//        System.out.println(input.equals("codeup rocks!")); // ?
//        System.out.println(input.equals("Codeup Rocks!")); // ?
//
//        System.out.println();
//        System.out.println(input.equalsIgnoreCase("codeup rocks!")); // ?
//        System.out.println(input.equalsIgnoreCase("Codeup Rocks!")); // ?
//
//        System.out.println();
//        System.out.println(input.startsWith("codeup")); // ?
//        System.out.println(input.startsWith("Codeup")); // ?
//
//        System.out.println();
//        System.out.println(input.endsWith("rocks")); // ?
//        System.out.println(input.endsWith("rocks!")); // ?
//        System.out.println(input.endsWith("Rocks!")); // ?
//        System.out.println(input.toLowerCase().endsWith("rocks!")); // ?

        // Demo String methods
        String demo = new String("Returns the length of a string.");

        System.out.println();
        System.out.printf("demo.charAt(6):\t%c\n\n", demo.charAt(6)); // s

        System.out.printf("demo.indexOf(\"the\"):\t%d\n", demo.indexOf("the")); // 8
        System.out.printf("demo.indexOf(\"then\"):\t%d\n", demo.indexOf("then")); // -1
        System.out.printf("demo.lastIndexOf(\"th\"):\t%d\n\n", demo.lastIndexOf("th")); // 16

        System.out.printf("demo.length():\t%d\n\n", demo.length()); // 31

        System.out.printf("demo.replace(\"length\", \"size\"):\t%s\n\n",
                demo.replace("length", "size")); // ?

        System.out.printf("demo.substring(2,5):\t%s\n\n", demo.substring(2,5)); // "turns", "turn", "tur"

        demo = "Returns a string that has all lower case letters.";
        System.out.printf("demo.toLowerCase():\t%s\n\n", demo.toLowerCase()); // ?

        System.out.printf("demo.toUpperCase():\t%s\n\n", demo.toUpperCase()); // ?

        demo ="     Returns a copy of the string without leading and trailing whitespaces.\t    ";
        System.out.printf("demo.trim():\t<BEGIN>%s<END>\n\n", demo.trim());



    }
}
