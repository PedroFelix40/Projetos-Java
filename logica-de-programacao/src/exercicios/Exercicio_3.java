package exercicios;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em graus celsius: ");
        float celsius = sc.nextFloat();

        float fahrenheit = (celsius * 9/5) + 32;

        float kelvin = (float) (celsius + 273.15);

        float reaumur = (float) (celsius/1.25);

        float rankine = (float)(celsius * 9/5 + 491.67);

        System.out.printf("\nA temperatura %.1f em Fahrenheit é igual a: %.1f", celsius, fahrenheit);

        System.out.printf("\nA temperatura %.1f em Fahrenheit é igual a: %.1f", celsius, kelvin);

        System.out.printf("\nA temperatura %.1f em Fahrenheit é igual a: %.1f", celsius, reaumur);

        System.out.printf("\nA temperatura %.1f em Fahrenheit é igual a: %.1f", celsius, rankine);
    }
}
