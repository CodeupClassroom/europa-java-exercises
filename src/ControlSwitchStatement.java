
public class ControlSwitchStatement {

    public static void main(String[] args) {

        // Basic with int
//        System.out.println();
//        int intOption = 3;
//        switch (intOption) {
//            case 1:
//                System.out.println("intOption is 1");
//                break;
//            case 2:
//                System.out.println("intOption is 2");
//                break;
//            case 3:
//                System.out.println("intOption is 3");
//                break;
//            case 4:
//                System.out.println("intOption is 4");
//                break;
//            case 5:
//                System.out.println("intOption is 5");
//                break;
//            default:
//                System.out.println("Failure is an option");
//        }

        // byte
        // What will this print
        System.out.println();
        byte byteOption = 3;
        switch (byteOption) {
            case 1:
                System.out.println("byteOption is 1");
                break;
            case 2:
                System.out.println("byteOption is 2");
                break;
            case 3:
                System.out.println("byteOption is 3");
                break;
            case 4:
                System.out.println("byteOption is 4");
                break;
            case 5:
                System.out.println("byteOption is 5");
                break;
            default:
                System.out.println("Failure is an option");
                break;
        }

        // will this compile
//        System.out.println();
//        long longOption = 2;
//        switch (longOption) {
//            case 1:
//                System.out.println("byteOption is 1");
//                break;
//            case 2:
//                System.out.println("byteOption is 2");
//                break;
//            case 3:
//                System.out.println("byteOption is 3");
//                break;
//            default:
//                System.out.println("Failure is an option");
//        }

        // It's not my default
        // What will this print
//        System.out.println();
//        char charOption = 'd';
//        switch (charOption) {
//            case 'a':
//                System.out.println("charOption is 'a'");
//                break;
//            case 'b':
//                System.out.println("charOption is 'b'");
//                break;
//            default:
//                System.out.println("Failure is an option");
//            case 'c':
//                System.out.println("charOption is 'c'");
//                break;
//        }

        // How do I love thee; let me enumerate the days
        // What will this print
//        System.out.println();
//        Day day = Day.SATURDAY;
//        switch (day) {
//            case MONDAY:
//                System.out.println("Mondays are bad.");
//                break;
//            case FRIDAY:
//                System.out.println("Fridays is the best.");
//                break;
//            // you can use 'falling through' intentionally
//            case SATURDAY:
//            case SUNDAY:
//                System.out.println("Weekends are nice!");
//                break;
//            default:
//                System.out.println("Midweek days are so-so.");
//                break;
//        }

        // Interginerian
        // What will this print
//        System.out.println();
//        Integer integerOption = 1;
//        final Integer two = 2;
//        final int three = 3;
//        switch (integerOption) {
//            case 1:
//                System.out.println("integerOption is 1");
//                break;
//            case two:                                           // WILL THIS COMPILE?
//                System.out.println("integerOption is 2");
//                break;
//            case three:                                         // WILL THIS COMPILE?
//                System.out.println("integerOption is 3");
//                break;
//            default:
//                System.out.println("Failure is an option.");
//                break;
    }
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}



