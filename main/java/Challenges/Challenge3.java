package Challenges;

import java.io.IOException;
import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) throws IOException {
        Scanner Numbers = new Scanner(System.in);
        var number = 0;

        number = Numbers.nextInt();
        for (int i = 1 ; i <= number  ; i++) {
            if (i % 2 == 0 ) System.out.println(i);
        }
    }
}



// Crie um programa que leia um número
// e mostre os números pares até esse número,
// inclusive ele mesmo.
//Entrada
//Você receberá 1 valor inteiro N, onde N > 0.
//Saída
//Exiba todos os números pares até o valor de entrada,
// sendo um em cada linha.