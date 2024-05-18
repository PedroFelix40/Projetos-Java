package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); // Define o local padrão do programa

        final double PI = 3.1415;

        System.out.print("Digite o raio para calcularmos a área: ");
        float raio = sc.nextFloat();

        float result = (float) (PI * Math.pow(raio,2));

        System.out.printf("A área do círculo com raio de %.1f é igual a %.1f%n", raio, result);
    }
}
