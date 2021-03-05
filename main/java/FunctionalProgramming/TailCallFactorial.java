package FunctionalProgramming;

public class TailCallFactorial {
    public static void main(String[] args) {
        System.out.println(factorialA(5));
    }
    public static double factorialA(double value) {
        return factorialComTailCall(value, 1);
    }
    public static double factorialComTailCall(double value, double number) {
        if(value == 0) {
            return number;
        }
        return factorialComTailCall(value - 1, number * value);
    }
}
