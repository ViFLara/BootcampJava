import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class Inference {
    public static void main(String[] args) throws IOException {

        printsFullName("Valeria","Amorim");

        connectAndPrintURLJavaOracle();
    }
    private static void connectAndPrintURLJavaOracle() {
        try {
            var url = new URL("https://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();

            try(var bufferedReader = new BufferedReader(new InputStreamReader
                    (urlConnection.getInputStream()))) {
                System.out.println(bufferedReader.lines()
                        .collect(Collectors.joining()).replaceAll(">", ">\n"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printsFullName(String name, String surname) {
        var fullName = String.format("%s %s", name, surname);
        System.out.println(fullName);
    }

 /*   public static void printsSum(int... numbers) {
        int sum;
        if (numbers.length > 0) {
            sum = 0;
            for (int i : numbers) {
                sum += i;
            }
            System.out.println("The sum is ::: " + sum);
        }
    }*/
}
