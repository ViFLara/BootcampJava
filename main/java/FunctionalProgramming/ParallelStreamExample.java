package FunctionalProgramming;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {

        long beginning = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(ParallelStreamExample::factorial);
        long end = System.currentTimeMillis();
        System.out.println("Time of Serial execution :: " + (end - beginning));

        beginning = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(ParallelStreamExample::factorial);
        end = System.currentTimeMillis();
        System.out.println("Time of Parallel execution :: " + (end - beginning));
    }

    public static long factorial(long num) {
        long fat = 1;

        for (long i = 2; i <= num; i++) fat *= i;
        return fat;
    }
}
