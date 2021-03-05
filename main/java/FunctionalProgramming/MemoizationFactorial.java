package FunctionalProgramming;

import java.util.HashMap;
import java.util.Map;

public class MemoizationFactorial {
    static Map<Integer,Integer> FactorialMap = new HashMap<>();

    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(memoizationWithFactorial(15));
        long F = System.nanoTime();
        System.out.println("Factorial1 -> " + (F-I));

        I = System.nanoTime();
        System.out.println(memoizationWithFactorial(15));
        F = System.nanoTime();
        System.out.println("Factorial2 -> " + (F-I));
    }

    public static Integer memoizationWithFactorial(Integer value) {
        if (value == 1) {
            return value;
        } else {
            if (FactorialMap.containsKey(value)) {
                return FactorialMap.get(value);
            } else {
                Integer result = value * memoizationWithFactorial(value -1);
                FactorialMap.put(value,result);
                return result;
            }
        }
    }
}
