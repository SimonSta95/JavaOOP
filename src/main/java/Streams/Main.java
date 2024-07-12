package Streams;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Integer> numbers = Arrays.asList(1,3,2,4,5,8,7,10,6,9);

        //1
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(number -> number % 2 == 0)
                                           .toList();

        System.out.println("even: " + evenNumbers);

        //2
        List<Integer> doubledNumbers = numbers.stream()
                                              .map(number -> number * 2)
                                              .toList();

        System.out.println("doubled: " + doubledNumbers);

        //3
        List<Integer> sortAsc = numbers.stream()
                                       .sorted()
                                       .toList();

        System.out.println("sortAsc: " + sortAsc);

        //4
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);

        System.out.println("reduce: " + sum);

        //5
        evenNumbers.forEach(System.out::println);
        doubledNumbers.forEach(System.out::println);
        sortAsc.forEach(System.out::println);

        //Bonus
        csvReader();
        System.out.println("hahahihi");

    }

    public static void csvReader() throws IOException {
        try(Stream<String> lines = Files.lines(Path.of("C:\\Users\\dazed\\Desktop\\repos\\Neue Fische\\JavaOOP\\src\\main\\java\\Streams\\students.csv"))) {
            List<Student> students = lines
                    .skip(1)
                    .map(line -> line.split(","))
                    .filter(Main::isValid)
                    .map(fields -> new Student(
                            Integer.parseInt(fields[0].trim()),
                            fields[1].trim(),
                            Integer.parseInt(fields[2].trim()),
                            Integer.parseInt(fields[3].trim())
                    ))
                    .distinct()
                    .toList();

            students.forEach(System.out::println);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static boolean isValid(String[] fields) {
        if (fields.length != 4) return false;
        try {
            Integer.parseInt(fields[0].trim());
            Integer.parseInt(fields[3].trim());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
