package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamAPI {
    public static void main(String[] args) {

        // Create student collection
        List<String> students = new ArrayList<>();

        // Adding 4 students to collection
        students.add("Pedro");
        students.add("Thayse");
        students.add("Marcelo");
        students.add("Carla");
        students.add("Juliana");
        students.add("Thiago");
        students.add("Rafael");

        // Returns the count of stream elements
        System.out.println("Count: " + students.stream().count());

        // Returns the element with greater number of letters
        System.out.println("Greater number of letters: " + students.stream().max(Comparator.comparingInt(String::length)));

        // Returns the element with lower number of letters
        System.out.println("Lower number of letters: " + students.stream().min(Comparator.comparingInt(String::length)));

        // Returns the elements with letter R
        System.out.println("Names with letter R: " + students.stream().filter((student) ->
        student.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Returns a new collection with concatenated names
        System.out.println("Returns a new collection with the quantity of letters: " + students.stream().map(student ->
        student.concat(" - ").concat(String.valueOf(student.length()))).collect(Collectors.toList()));

        // Returns just the first 3 elements of the collection
        System.out.println("Returns the first 3 elements: " + students.stream().limit(3).collect(Collectors.toList()));

        // Displays each element on the console and then returns the same collection
        System.out.println("Returns the elements: " +
                students.stream().peek(System.out::println).collect(Collectors.toList()));

        // Displays each element on the console and doesn't returns other collection
        System.out.println("Returns again the elements: ");
        students.stream().forEach(System.out::println);

        // Returns true if all the elements have the letter W
        System.out.println("Does have w in all the elements? " +
                students.stream().allMatch((element) -> element.contains("w")));

        // Returns true if some element has the letter a
        System.out.println("Does have any element with a?: " + students.stream().anyMatch((element) ->
                element.contains("a")));

        // Returns true if all elements doesn't have the letter a
        System.out.println("Does not have the letter a in all the elements?: " +
                students.stream().noneMatch((element) -> element.contains("a")));

        // Returns the first element of the collection
        System.out.println("Returns the first element: ");
        students.stream().findFirst().ifPresent(System.out::println);

        // Example of chained operation
        System.out.println("Chained operation: ");
        System.out.println(students.stream().peek(System.out::println)
                .map((student -> student.concat(" - ")
                        .concat(String.valueOf(student.length()))))
                .peek(System.out::println)
                .filter((student ->
                        student.toLowerCase().contains("r")))
//              .collect(Collectors.toList()));
//              .collect(Collectors.joining(" , ")));
//              .collect(Collectors.toSet()));
                .collect(Collectors.groupingBy((student -> student.substring(student.indexOf("-") + 1)))));
    }
}
