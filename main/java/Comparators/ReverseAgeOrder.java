package Comparators;

import java.util.Comparator;

public class ReverseAgeOrder implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.getAge() - o1.getAge();
        }

}

