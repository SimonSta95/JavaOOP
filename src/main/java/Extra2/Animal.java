package Extra2;

import java.util.Objects;

public class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(animalName, animal.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(animalName);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                '}';
    }
}
