package OOPBasics;

public class Main {

    public static void main(String[] args) {
        Car firstCar = new Car("VW", "Golf VI","Weiß", 2015);
        firstCar.startCar();

        Car secondCar = new Car("BMW");
        secondCar.startCar();
        secondCar.accelerateCar();
        secondCar.accelerateCar();
        secondCar.stopCar();
        secondCar.accelerateCar();

        //Bonus
        Person Simon = new Person("Simon", 29, 'm');
        Simon.introducePerson();

        Person Max = new Person("Max", 35, 'm');
        Max.introducePerson();

        Person Laura = new Person("Laura", 24, 'w');
        Laura.introducePerson();
    }

}
