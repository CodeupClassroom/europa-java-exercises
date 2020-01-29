

public class ControlLogicalOperators {

    public static void main(String[] args) {

        // our boolean values;
        boolean yes = true;
        boolean no = false;
        System.out.println();

        // what will print?
        if (yes && no) {
            System.out.println("(yes && no) confirmed\n");
        } else {
            System.out.println("(yes && no) failed confirmation\n");
        }

        // what will print?
        if (yes || no) {
            System.out.println("(yes || no) confirmed\n");
        } else {
            System.out.println("(yes || no) failed confirmation\n");
        }

        // what will print?
        if (yes & no) {
            System.out.println("(yes & no) confirmed\n");
        } else {
            System.out.println("(yes & no) failed confirmation\n");
        }

        // what will print?
        if (yes | no) {
            System.out.println("(yes | no) confirmed\n");
        } else {
            System.out.println("(yes | no) failed confirmation\n");
        }

        // what will print?
        System.out.printf("7:     %s\n", Integer.toBinaryString(7));       // ?
        System.out.printf("7 & 4: %s\n", Integer.toBinaryString(7 & 4));   // 111
                                                                             // 100
                                                                             // 100
        System.out.printf("7 | 4: %s\n", Integer.toBinaryString(7 | 4)); // ?
        System.out.printf("1 | 4: %s\n\n", Integer.toBinaryString(1 | 4)); // ?

        // what will print?
        if (!(yes && no)) {
            System.out.println("(!(yes && no)) confirmed\n");
        } else {
            System.out.println("(!(yes && no)) failed confirmation\n");
        }
    }
}
