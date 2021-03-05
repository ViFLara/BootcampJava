package Challenges;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {

        Scanner Numbers = new Scanner(System.in);
        int i = 1, j= 0;
        double number;

        while( i <= 6) {
            number = Numbers.nextDouble();

            if(number == 0)
            System.out.println("Digite outro valor");

            else i++;

            if(number > 0 )
                j++;
        }
        System.out.println(j + " valores positivos");
    }
}
