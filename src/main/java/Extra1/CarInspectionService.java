package Extra1;

public class CarInspectionService {

    public static boolean checkTires(Car car){
        return car.getNumberOfTires() > 0;
    }

    public static boolean checkSeatBelt(Car car){
        return car.isSeatBelt();
    }

    public static boolean checkAirbag(Car car){
        return car.isAirbag();
    }

    public static boolean checkDoors(Car car){
        return car.getNumberOfDoors() == 3;
    }

    public static boolean checkCar(Car car){
        return checkDoors(car) && checkSeatBelt(car) && checkAirbag(car) && checkTires(car) && car.getNumberOfDoors() == 3;
    }
}
