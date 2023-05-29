package aula30Entrega.repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SomaPositivo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        DecimalFormat d = new DecimalFormat();
        double entrada = 0.0;
        int contador = 0;
        double soma = 0;
        int quantidade = 0;
        System.out.println("Por favor, indique quantos números deseja somar: ");
        quantidade = sc.nextInt();

        while (contador < quantidade){
            System.out.println("por favor, insira o número a ser somado: ");

       entrada = sc.nextDouble();
       soma += entrada;
       if (entrada <= 0){
           System.out.println("número inválido, aqui só é aceito números positivos.");
      soma = 0;

       }

       contador ++;
        }

        System.out.println("a soma dos números é: " + soma);

sc.close();
    }

}


