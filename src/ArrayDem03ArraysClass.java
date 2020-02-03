
import java.util.Arrays;

public class ArrayDem03ArraysClass {

    public static void main(String[] args) {

        // test the fill method and the toString method of the Arrays Class
        int[] myInts = new int[5];
        Arrays.fill(myInts, -5);
        System.out.printf("\nArrays.toString(myInts): %s\n", Arrays.toString(myInts)); // ?

        // test the equals function
        int[] intArr = {-5, -5, -5, -5, -5};
        int[] dummyArr = {0, 0, 0};
        System.out.printf("\nArrays.equals(myInts, intArr):    %s\n", Arrays.equals(myInts, intArr)); // ?
        System.out.printf("Arrays.equals(myInts, dummyArr):  %s\n", Arrays.equals(myInts, dummyArr)); // ?

        // test the copyOf function
        int[] copyArr = Arrays.copyOf(intArr, 5);
        System.out.printf("\nArrays.equals(intArr, copyArr):    %s\n", Arrays.equals(intArr, copyArr)); // ?
        copyArr = Arrays.copyOf(intArr, 4);
        System.out.printf("Arrays.equals(intArr, copyArr):    %s\n", Arrays.equals(intArr, copyArr)); // ?

        // test the sort and toString function
        int[] anIntArray = {7, 3, 1, 2, 4, 5, 6};
        System.out.printf("\nArrays.toString(anIntArray): %s\n", Arrays.toString(anIntArray)); // ?
        Arrays.sort(anIntArray);
        System.out.printf("Arrays.toString(anIntArray): %s\n", Arrays.toString(anIntArray)); // ?


    }
}
