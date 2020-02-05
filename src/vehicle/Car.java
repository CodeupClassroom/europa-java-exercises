package vehicle;

public class Car implements Vehicle {
    public void go(double miles){
        System.out.println("Go, vroom for "+miles+" miles!" );
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2(int num) {

    }

    @Override
    public int method3(String message) {
        return 0;
    }

}
