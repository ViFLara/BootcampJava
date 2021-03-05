package utilSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        Set<Double> gradeStudents;
        gradeStudents = new HashSet<>();

        //Adding grades
        gradeStudents.add(5.8);
        gradeStudents.add(9.3);
        gradeStudents.add(5.8);
        gradeStudents.add(10.0);
        gradeStudents.add(5.8);
        gradeStudents.add(7.3);
        gradeStudents.add(3.8);
        gradeStudents.add(4.0);

        System.out.println(gradeStudents);

        // Removes grade
        gradeStudents.remove(3.8);
        System.out.println(gradeStudents);

        // Returns the quantity of items
        System.out.println(gradeStudents.size());

        // Goes through the iterator items
        Iterator<Double> iterator = gradeStudents.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Double grade: gradeStudents) {
            System.out.println(grade);
        }

    }
}
