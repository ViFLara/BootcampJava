package FunctionalProgramming;

import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        // Method Reference

       // Consumer<String> printPhrase = System.out::println;
        Consumer<String> printPhrase = phrase -> System.out.println(phrase);
        printPhrase.accept("Hello World ");
    }
}
