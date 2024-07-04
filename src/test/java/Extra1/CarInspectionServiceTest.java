package Extra1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @Test
    public void whenCarHasTiresReturnTrue(){
        //GIVEN
        Car myCar = new Car( 4, 5, true, true);

        //WHEN
        boolean actual = CarInspectionService.checkTires(myCar);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void whenCarHasNoTires_thenReturnFalse(){
        //GIVEN
        Car myCar = new Car( 0, 5, true, true);

        //WHEN
        boolean actual = CarInspectionService.checkTires(myCar);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void whenCarHasSeatBelt_thenReturnTrue(){
        //GIVEN
        Car myCar = new Car( 4, 5, true, true);

        //WHEN
        boolean actual = CarInspectionService.checkSeatBelt(myCar);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void whenCarHasNoSeatBelt_thenReturnFalse(){
        //GIVEN
        Car myCar = new Car( 4, 5, false, true);

        //WHEN
        boolean actual = CarInspectionService.checkSeatBelt(myCar);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void whenCarHasAirbag_thenReturnTrue(){
        //GIVEN
        Car myCar = new Car( 4, 5, true, true);

        //WHEN
        boolean actual = CarInspectionService.checkAirbag(myCar);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void whenCarHasNoAirbag_thenReturnFalse(){
        //GIVEN
        Car myCar = new Car( 4, 5, true, false);

        //WHEN
        boolean actual = CarInspectionService.checkAirbag(myCar);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void whenCarHas3Doors_thenReturnTrue(){
        //GIVEN
        Car myCar = new Car( 4, 3, true, true);

        //WHEN
        boolean actual = CarInspectionService.checkDoors(myCar);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void whenCarHas5Doors_thenReturnFalse(){
        //GIVEN
        Car myCar = new Car( 4, 5, true, true);

        //WHEN
        boolean actual = CarInspectionService.checkDoors(myCar);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void whenCarCheckHasNoTires_thenReturnFalse(){
        //GIVEN
        Car myCar = new Car( 0, 3, true, true);

        //WHEN
        boolean actual = CarInspectionService.checkCar(myCar);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void whenCarCheckHasNoSeatBelt_thenReturnFalse(){
        //GIVEN
        Car myCar = new Car( 4, 3, false, true);

        //WHEN
        boolean actual = CarInspectionService.checkCar(myCar);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void whenCarCheckHasNoAirbag_thenReturnFalse(){
        //GIVEN
        Car myCar = new Car( 4, 3, true, false);

        //WHEN
        boolean actual = CarInspectionService.checkCar(myCar);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void whenCarCheckHas5Doors_thenReturnFalse(){
        //GIVEN
        Car myCar = new Car( 4, 5, true, true);

        //WHEN
        boolean actual = CarInspectionService.checkCar(myCar);

        //THEN
        assertFalse(actual);
    }

}