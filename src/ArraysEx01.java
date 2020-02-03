
import java.util.Arrays;

public class ArraysEx01 {

    /**
     * Drover for Arrays exercises
     * @param args  Unused
     */
    public static void main(String[] args) {

        // what will this print?
//        System.out.println();
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        /*
         * Create an array that holds 3 Person objects. Assign a new instance of the Person class to each
         * element. Iterate through the array and print out the name of each person in the array.
         */
        Person[] personArray = new Person[3];
        Person aPerson = new Person();
        aPerson.setFirstName("First");
        aPerson.setLastName("Person");
        personArray[0] = aPerson;

        aPerson = new Person();
        aPerson.setFirstName("Second");
        aPerson.setLastName("Person");
        personArray[1] = aPerson;

        aPerson = new Person();
        aPerson.setFirstName("Third");
        aPerson.setLastName("Person");
        personArray[2] = aPerson;

        System.out.println();
        System.out.println("Names from the person array:");
        for (Person person : personArray) {
            System.out.printf("\t%s %s\n", person.getFirstName(), person.getLastName());
        }
        System.out.println();
//
//        // add an element
        aPerson = new Person();
        aPerson.setFirstName("Fourth");
        aPerson.setLastName("Person");
        personArray = addPerson(personArray, aPerson);
        System.out.println("\nThe copies array data:\n" + Arrays.toString(personArray));

    }

    /**
     * Method to copy array and add a new person
     * @param inputArray    Array to be copied
     * @param aPerson       Element to be added
     * @return              A copy of the array with the element added to the end.
     */
    public static Person[] addPerson(Person[] inputArray, Person aPerson) {
        int length = 0;
        Person[] newPersonList = null;
        if (inputArray == null) length = 0;
        else length = inputArray.length;

        // copy using Arrays
        newPersonList = Arrays.copyOf(inputArray, length+1);

        // Copy using loop
//        newPersonList = new Person[length + 1];
//        for (int i = 0; i < length; i++) {
//            newPersonList[i] = new Person(inputArray[i]);
//        }
//
//        // add new entry
        newPersonList[length] = aPerson;

        return newPersonList;
    }
}
