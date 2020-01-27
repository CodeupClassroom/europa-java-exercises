public class HelloWorld {
    public static void main(String[] bananas){
        int myFavoriteNumber;
        myFavoriteNumber = 86;
        System.out.println(myFavoriteNumber);

//        String myString = 3.14159;
//        System.out.println(myString);

//        float myNumber = (float) 3.14;
        float myNumber = 3.14f;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        long ourClass = 24;

        Integer theNumberThree = 3;
        Object o = theNumberThree;
        int three = (int) o;
        System.out.println(three);

        byte num = 127;
        System.out.println(++num);

        int num2 = Integer.MAX_VALUE;
        System.out.println(num2++);
        System.out.println(num2);
    }
}
