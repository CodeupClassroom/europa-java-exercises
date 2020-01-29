

public class ControlIffyDemo {

    public static void main(String[] args) {
        boolean someCondition = true;
        boolean someOtherCondition = false;

        // Single condition
        if (someCondition) {
            System.out.println("\nsomeCondition is true");
        } // What will print?

        // multi-condition
        if (someCondition) {
            System.out.println("someCondition is true");
        } else if (someOtherCondition) {
            System.out.println("someCondition is false, but someOtherCondition is true");
        } // What will print?

        // multi-condition with default
        if (!someCondition) {
            System.out.println("!someCondition is true");
        } else if (someOtherCondition || !someCondition) {
            System.out.println("someOtherCondition is true and someCondition is false");
        } else {
            System.out.println("The truth is hard to come by");
        } // What will print?
    }
}
