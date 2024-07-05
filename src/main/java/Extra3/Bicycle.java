package Extra3;

public class Bicycle extends Vehicle {
    public int accelerate(int kmh){

        if(this.getVelocity() < 35){
            System.out.println("Bicycle is accelerating");
            this.setVelocity(this.getVelocity() + kmh);
            return this.getVelocity() + kmh;
        }

        System.out.println("Bicycle is too fast, it can't accelerate anymore");
        return this.getVelocity();
    }
}
