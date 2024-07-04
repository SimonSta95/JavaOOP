package OOPInheritance;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("VW", "Golf", 2019);
        Car car = new Car("BMW","M3", 2023,3);
        Motorcycle motorcycle = new Motorcycle("Suzuki", "GSXR 600", 2020, "Sportbike", 2);

        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(motorcycle);

    }
}
