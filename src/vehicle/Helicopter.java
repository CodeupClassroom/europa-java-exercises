package vehicle;

public class Helicopter implements Vehicle{
    public void fly(){
        //do something
    }
    @Override
    public void go(double miles) {
        System.out.println("wubwubwub");
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
