public class MethodsLesson {
    public static void main(String[] args) {
        System.out.println("We are in main(String[] args)");

        // javascript function
//        function countTo(n) {
//            for (let i=1;i<=n;i++) {
//                console.log(i)
//            }
//        }
//        countTo(33);
//        System.out.println(squareIt(12));

//        System.out.println(multiplyNumbers(2, 3, 4, 5));
        long pies = multiplyNumbers(2,3,4);
        // public static ReturnType methodName(ParamType1 param1, ParamType2 param2, ...) {
        // method body
        // }
        recursiveCountdown(10);
    }
    // java method
    public static int countTo(int n) {
        System.out.println("We are in countTo(int)");
        for (int i=1;i<=n;i++) {
            System.out.println(i);
        }
        return n;
    }

    public static double squareIt(int num) {
        System.out.println("In squareIt");
//        Math.pow(num, 2);
        long numSquared = num * num;
        return numSquared;
    }

    public static String multiplyNumbers(String message, int a, int b, int c, int q) {
        System.out.println(message);
        return message;
    }
    public static long multiplyNumbers( int a, int b, int c, int q,String message) {
        System.out.println(message);
        return a * b * c * q;
    }

    public static long multiplyNumbers(int a, int b, int c) {
        return a * b * c;
    }
    //cannot only change return type
//    public static int multiplyNumbers(int a, int b, int c) {
//        return a * b * c;
//    }
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static String convert(int num) {
        return "" + num;
    }

    public static void aMethod() {
        System.out.println("We are in aMethod()");
        anotherMethod("Hello", "World");
    }

    public static void anotherMethod(){
        System.out.println("We are in anotherMethod()");
    }
    public static void anotherMethod(String message){
        System.out.println("We are in anotherMethod(String)");
        System.out.println("Here is the message: " + message);
    }
    public static void anotherMethod(String message1, String message2){
        System.out.println("We are in anotherMethod(String, String)");
        System.out.println("Here is the first message: " + message1);
        System.out.println("Here is the second message: " + message2);
    }


    public static void recursiveCountdown(int n) {
        System.out.println("We are at the beginning recursiveCountdown() and n="+n);

        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        recursiveCountdown(n-1);
        System.out.println("We are at the end of recursiveCountdown() and n="+n);
        return;
    }
}
