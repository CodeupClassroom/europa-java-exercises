package movies;

import inheritance.Vehicle;

public class BiPlane extends Vehicle {

    public BiPlane(int numberOfTires) {
        super(numberOfTires);
        this.numberOfTires = 2;
    }
}
