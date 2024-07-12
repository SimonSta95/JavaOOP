package EnumsAndOptionals;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {

        PersonRepository personRepository = new PersonRepository();

        personRepository.people.add(new Person(1,"Simon",DaysOfWeek.FRIDAY,Gender.MALE ));
        personRepository.people.add(new Person(2,"Lisa",DaysOfWeek.MONDAY,Gender.FEMALE ));
        personRepository.people.add(new Person(3,"Christoph",DaysOfWeek.THURSDAY,Gender.MALE ));
        personRepository.people.add(new Person(4,"Mike",DaysOfWeek.WEDNESDAY,Gender.MALE ));
        personRepository.people.add(new Person(5,"Kevin",DaysOfWeek.FRIDAY,Gender.MALE ));
        personRepository.people.add(new Person(6,"Laura",DaysOfWeek.SATURDAY,Gender.FEMALE ));
        personRepository.people.add(new Person(7,"Sophie",DaysOfWeek.SATURDAY,Gender.FEMALE ));
        personRepository.people.add(new Person(8,"Mark",DaysOfWeek.FRIDAY,Gender.MALE ));
        personRepository.people.add(new Person(9,"Lea",DaysOfWeek.SUNDAY,Gender.FEMALE ));
        personRepository.people.add(new Person(10,"Peter",DaysOfWeek.FRIDAY,Gender.MALE ));


        System.out.println(personRepository.getPerson(9) + "\n");
        System.out.println(personRepository.countGender());

    }

    public String returnWeekdayOrWeekend(DayOfWeek day){
        switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                //return "Weekday"
                return day.name();
            case SATURDAY:
            case SUNDAY:
                return "Weekend";
            default:
                return "Invalid day";
        }
    }
}
