package aula30Entrega.repeticao;

import java.util.Scanner;

public class SomaIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
int ponto1 = 0;
int ponto2 = 0;

        System.out.println("defina um primeiro delimitador: ");
   ponto1 = sc.nextInt();
        System.out.println("agora, delimite o próximo limite: ");
        ponto2 = sc.nextInt();
        if (ponto1 > ponto2){
            System.out.println("erro, volte e realize do menor para o maior");
        }
        while (ponto1 < ponto2){
            if ((ponto1%2) != 0){
                System.out.println(ponto1);

         soma += ponto1;
            }
            ponto1++;
        }
        System.out.println("o resultado é: " + soma);
        sc.close();
   }


}

