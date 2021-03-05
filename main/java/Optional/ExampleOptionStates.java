package Optional;

import java.util.Optional;

public class ExampleOptionStates {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Present value");

        System.out.println("Option present value");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("does not present"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("option value does not present");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = does not present"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("option value does not present");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = does not present"));

        Optional<String> optionalNullError = Optional.of(null);

        System.out.println("optional value that throws error NullPointerException");
        optionalNullError.ifPresentOrElse(System.out::println, () -> System.out.println("error = does not present"));

    }
}
