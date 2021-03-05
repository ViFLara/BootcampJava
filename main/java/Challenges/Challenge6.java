package Challenges;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) throws IOException {

        Scanner Numbers = new Scanner(System.in);

        int x = Numbers.nextInt();
        double y = Numbers.nextDouble();

        double Cons_Medio = x / y;
        DecimalFormat formata = new DecimalFormat("0.000");

        System.out.println(formata.format(Cons_Medio) + " km/l");

    }
}
