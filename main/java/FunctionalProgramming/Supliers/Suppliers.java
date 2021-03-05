package FunctionalProgramming.Supliers;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {

        Supplier<Person> suppliers = Person::new;
        // Gets a result, Returns a result
        System.out.println(suppliers.get());
    }
    static class Person {
        private final String name;
        private final Integer age;

        public Person() {
            name = "Carla";
            age = 40;
        }
        @Override
        // Returns: a string representation of the object.
        public String toString() {
            return String.format("name : %s, age : %d", name, age);
        }
    }
}
