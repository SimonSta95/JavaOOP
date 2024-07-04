package OOPInheritance;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("VW", "Golf", 2019);
        Car car = new Car("BMW","M3", 2023,3);

        System.out.println(vehicle);
        System.out.println(car);

    }
}
