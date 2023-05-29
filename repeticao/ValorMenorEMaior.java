package aula30Entrega.repeticao;

import java.util.Scanner;

public class ValorMenorEMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int contador = 1;
    double entrada = 0;
    double maiorN = - 300000000;
    double menorN = 300000000;
    while (contador <= 10){
        System.out.println("informe um número: ");
   entrada = sc.nextDouble();
   if (entrada < menorN){
       menorN = entrada;
   } else if (entrada > maiorN){
       maiorN = entrada;
   }
   contador ++;
    }


        System.out.println("o maior número é: " + maiorN + " e o menor número é: " + menorN);

sc.close();
    }

}


