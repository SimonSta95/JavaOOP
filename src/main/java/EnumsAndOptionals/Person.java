package EnumsAndOptionals;

public record Person(
        int id,
        String name,
        DaysOfWeek favoriteDay,
        Gender gender
) {
}
