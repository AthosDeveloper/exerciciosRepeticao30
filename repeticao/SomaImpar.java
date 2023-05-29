package aula30Entrega.repeticao;

public class SomaImpar {
    public static void main(String[] args) {
int soma = 0;
        for (int i = 1; i < 100; i++){
      if ((i%2) != 0){
          System.out.println(i);
      }
      soma += i;

        }

        System.out.println("o resultado é: " + soma);
    }
}
