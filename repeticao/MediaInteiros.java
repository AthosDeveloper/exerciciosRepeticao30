package aula30Entrega.repeticao;

import java.util.Scanner;

public class MediaInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int numero = 0;
int pegaNumero = 0;
int imput = 0;
int media = 0;
        System.out.println("informe quantos números deverão ser somados para o cáuculo da média:");
imput = sc.nextInt();
while (numero < imput){
    System.out.println("informe o valor do número: ");
    int valor = sc.nextInt();
    pegaNumero += valor;
numero ++;

}
media = pegaNumero / imput;


        System.out.println("a média dos números é: " + media);
sc.close();
    }



}
