package OOPBasics;

public class Car {
    String Brand;
    String Model;
    String Color;
    int Year;
    int speed;
    boolean isStarted = false;

    public Car(String brand, String model, String color, int year) {
        this.Brand = brand;
        this.Model = model;
        this.Color = color;
        this.Year = year;
        this.speed = 0;
    }

    public Car(String brand) {
        this.Brand = brand;
        this.Model = "";
        this.Color = "";
        this.Year = 1973;
        this.speed = 0;
    }

    public void startCar() {
        System.out.println("OOPBasics.Car started");
        isStarted = true;
    }

    public void stopCar() {
        System.out.println("OOPBasics.Car has stopped");
        isStarted = false;
    }

    public void accelerateCar() {
        if (isStarted) {
            speed += 5;
            System.out.println("Speed: " + this.speed);

        } else {
            System.out.println("OOPBasics.Car is not started yet.");
        }
    }
}
