package OOPInheritance;

import java.util.Objects;

public class Motorcycle extends Vehicle {
    protected String type;
    protected int numberOfWheels;

    public Motorcycle() {}

    public Motorcycle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String type, int numberOfWheels) {
        super(manufacturer, model, yearOfManufacture);
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return numberOfWheels == that.numberOfWheels && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, numberOfWheels);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "type='" + type + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
