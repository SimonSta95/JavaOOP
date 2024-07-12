package EnumsAndOptionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {

    List<Person> people;
    public PersonRepository() {
        people = new ArrayList<>();
    }

    public Optional<Person> getPerson(int id) {
        for (Person person : people) {
            if(person.id() == id){
                return Optional.of(person);
            }
        }

        return Optional.empty();
    }

    public Optional<Person> getPersonByName(String name) {
        for (Person person : people) {
            if(person.name().equals(name)){
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public List<Person> getPersonByFavoriteDay(DaysOfWeek day) {
        List<Person> persons = new ArrayList<>();
        for (Person person : people) {
            if(person.favoriteDay().equals(day)){
                persons.add(person);
            }
        }
        return persons;
    }

    public String countGender(){
        int male = 0;
        int female = 0;
        int diverse = 0;

        for (Person person : people) {
            if(person.gender() == Gender.MALE){
                male++;
            }
            if(person.gender() == Gender.FEMALE){
                female++;
            }
            if(person.gender() == Gender.DIVERSE){
                diverse++;
            }
        }

        return "Male: " + male + "\n" + "Female: " + female + "\n" + "Diverse: " + diverse;
    }
}
