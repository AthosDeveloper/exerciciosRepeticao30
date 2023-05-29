package aula30Entrega.repeticao;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int primo = 0;

        System.out.println("informe o número para que eu determine se ele é um número primo ou não: ");

primo = sc.nextInt();
if ((primo%2) != 0){
    System.out.printf("o número %d é primo.", primo);
} else
    System.out.printf("ele não é primo");
 sc.close();
    }

}


