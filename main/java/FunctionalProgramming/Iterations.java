package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Iterations {
    public static void main(String[] args) {
        String[] names = {"Joao", "Paulo", "Carlos", "Janaina", "Roberta", "Luisa"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        printFilteredNames(names);
        printNumberPlus2(numbers);
        printAllNames(names);

        List<String> professions = new ArrayList<>();
        professions.add("Programmer");
        professions.add("Engineer");
        professions.add("Project Manager");
        professions.add("Quality Manager");

        professions.stream()
                .filter(profession -> profession.endsWith("Manager"))
                .forEach(System.out::println);
    }

    public static void printFilteredNames(String... names) {

        StringBuilder namesToPrint = new StringBuilder();
        for (String name : names) {
            if (name.equals("Joao")) {
                namesToPrint.append(" ").append(name);
            }
        }
        System.out.println(namesToPrint);
    }

    public static void printAllNames(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
        Stream.of(names).forEach(System.out::println);
    }

    public static void printNumberPlus2(Integer... numbers) {
        for (Integer number : numbers) {
            System.out.println(number*2);
        }
        Stream.of(numbers).map(number -> number*2)
                .forEach(System.out::println);
    }
}
