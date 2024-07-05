package Extra3;

public class Car extends Vehicle {

    public int accelerate(int kmh){

        System.out.println("Car is accelerating");
        this.setVelocity(this.getVelocity() + kmh);
        return this.getVelocity() + kmh;
    }
}
