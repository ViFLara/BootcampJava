package Challenges;

import java.io.IOException;
import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) throws IOException {

        Scanner Numbers = new Scanner(System.in);
        int cont = 0, conta_par = 0, conta_impar = 0, conta_positiva = 0, conta_negativa = 0;
        int num;

        while (cont < 5){
            num = Numbers.nextInt();
            cont++;
            if (num % 2 == 0){
                conta_par++;
            }else {
                conta_impar++;
            }if (num > 0) {
                conta_positiva++;
            }else if (num < 0){
                conta_negativa++;
            }
        }
        System.out.println(conta_par + " valor(es) par(es)");
        System.out.println(conta_impar + " valor(es) impar(es)");
        System.out.println(conta_positiva + " valor(es) positivo(s)");
        System.out.println(conta_negativa + " valor(es) negativo(s)");
    }
}





