package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Pedro", 19));
        students.add(new Student("Carlos", 23));
        students.add(new Student("Mariana", 21));
        students.add(new Student("Joao", 18));
        students.add(new Student("Thiago", 20));
        students.add(new Student("George", 22));
        students.add(new Student("Larissa", 21));

        System.out.println("--- insertion order ---");
        System.out.println(students);

        students.sort((first, second) -> first.getAge() - second.getAge());

        System.out.println("--- natural number order - age ---");
        System.out.println(students);

        students.sort((first, second) -> second.getAge() - first.getAge());

        System.out.println("reverse number order - age ---");
        System.out.println(students);

        students.sort(Comparator.comparingInt(Student::getAge));

        System.out.println("--- natural number order - age (method reference) ---");
        System.out.println(students);

        students.sort(Comparator.comparingInt(Student::getAge).reversed());

        System.out.println("reverse number order - age (method reference) ---");
        System.out.println(students);

        Collections.sort(students);

        System.out.println("--- natural number order - age (Comparable Interface) ---");
        System.out.println(students);

    }
}
