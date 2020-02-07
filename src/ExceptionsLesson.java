import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ExceptionsLesson {
    public static void main(String[] args) {
        System.out.println("Our program is now running.");

//        try {
//            divide(5, 0);
//            itsAnInt("Hello");
//            outOfBounds(new int[6]);
//            outOfBounds2();
//            nullPointer();
//            numberFormatError();
//            badDate();
//        } catch (ArithmeticException aex) {
//            System.out.println("An exception occurred.");
//            aex.printStackTrace();
//        } catch (Exception ex) {
//            System.out.println("An exception occurred.");
//            ex.printStackTrace();
//        }

        boolean moveOn = false;
        do {
            try {
                readError();
                moveOn = true;
            } catch (Exception ex) {
                System.out.println("That's not what we asked for");
//                ex.printStackTrace();
            }
        } while (!moveOn);

//        anotherBadDate();
//        try {
//            newException();
//        } catch (Exception ex){
//            System.out.println("This is catching an exception at a higher level");
//        }
        System.out.println("If we make it here, it means our program didn't die.");
    }

    static int divide(int a, int b){
        // java.lang.ArithmeticException: / by zero
        return a/b;
    }

    static int itsAnInt(Object a){
//        java.lang.ClassCastException: java.base/java.lang.String cannot be cast to java.base/java.lang.Integer
        int b = (Integer) a;
        return b;
    }

    static int outOfBounds(int[] nums){
        // java.lang.ArrayIndexOutOfBoundsException: 6
        return nums[nums.length];
    }

    static void outOfBounds2(){
        // java.lang.IndexOutOfBoundsException: Index 20 out-of-bounds for length 2
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("bananas");
        fruit.add("apples");
        System.out.println(fruit.get(2));
    }

    static void nullPointer(){
        // java.lang.NullPointerException
        String ptr = null;
        if (ptr.equals("Hello"))
            System.out.println(ptr + " World");
    }

    static void numberFormatError(){
        // java.lang.NumberFormatException: For input string: "hello"
        int num = Integer.parseInt ("hello");
    }

    static void badDate(){
        // java.lang.IllegalArgumentException
        Date date = new Date("2020/02/02");
    }

    static void anotherBadDate(){
        String dateStr = "2020-02-30";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date;

////        try {
//            date = dateFormat.parse(dateStr);
//            System.out.println(date);

//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

    }

    static int readError(){
        // java.util.InputMismatchException
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        return scanner.nextInt();
    }

    static void newException() throws Exception{
        throw new Exception();

//        try{
//            throw new Exception();
//        } catch (Exception ex){
//            System.out.println("We caught an exception!");
//        }
    }

    static void weKnowSomethingMightBeWrongHere(){
        try {
            File file = new File("file.txt"); // file does not exist

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}

class CustomException extends Exception{

}




