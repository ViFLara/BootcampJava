package FunctionalProgramming;

public class HighOrderFunction {
    public static void main(String[] args) {
        Calculation Sum = Integer::sum;
        Calculation Subtraction = (a, b) -> a - b;
        Calculation Multiplication = (a, b) -> a * b;

        System.out.println(performsOperation(Sum,1 ,3));
        System.out.println(performsOperation(Subtraction,5 ,3));
        System.out.println(performsOperation(Multiplication,12 ,3));
    }

    public static int performsOperation(Calculation Sum, int a, int b) {
        return Sum.calculate(a,b);
    }
}

@FunctionalInterface
interface Calculation {
    int calculate(int a, int b);
}
