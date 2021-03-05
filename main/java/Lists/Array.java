package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();
        int numero;
//Inserir elementos na lista
        do {
            System.out.print("Digite um número: ");
            numero = Integer.parseInt(entrada.nextLine());
            if (numero != 0) {
                lista.add(numero);
            }
        } while (numero != 0);
//Exibir todos os elementos da lista
        System.out.println("=== Os números inseridos foram ===");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        /*int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        for (int i = 0; i< dias.length;i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        for (int[] ref : dias) {
            for (int dia : ref){
                System.out.println(dia);
            }
        }
*/
    }

}
