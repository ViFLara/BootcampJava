package Challenges;

import java.io.IOException;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) throws IOException {

        int valor,troco, cem , cinquenta , vinte , dez , cinco , dois;
        Scanner Numbers = new Scanner(System.in);

        valor = Numbers.nextInt();

        troco = valor;
        cem = troco / 100;
        troco = troco - (cem *100);
        cinquenta = troco / 50;
        troco = troco - (cinquenta * 50);
        vinte = troco / 20;
        troco = troco - (vinte * 20);
        dez = troco /10;
        troco = troco -(dez * 10);
        cinco = troco / 5;
        troco = troco - (cinco * 5);
        dois = troco / 2;
        troco = troco - (dois * 2);

        System.out.println(valor);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(troco + " nota(s) de R$ 1,00");
    }
}
