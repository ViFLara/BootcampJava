package FunctionalProgramming;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<String,String> returnsNameBackwards =
                text -> new StringBuilder(text).reverse().toString();
        Function<String,Integer> convertStringToInteger = string -> Integer.valueOf(string)*2;

        System.out.println(returnsNameBackwards.apply("Margarida"));
        System.out.println(convertStringToInteger.apply("20"));
    }
}
