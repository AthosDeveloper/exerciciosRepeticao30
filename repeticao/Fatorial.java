package aula30Entrega.repeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial = 1;
   int entrada = 0;

        System.out.println("por favor, digite o número para encontrar seu fatorial: ");
        entrada = sc.nextInt();
for (int i = entrada; i >= 1; i--){
fatorial *= i;

        }
        System.out.println("o fatorial é: " + fatorial);

    }

}
