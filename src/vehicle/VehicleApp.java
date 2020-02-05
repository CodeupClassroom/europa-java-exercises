package vehicle;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle veh = new Helicopter();
        veh.go(5);
//        veh.fly(); Vehicle doesn't have a fly method
    }
}
