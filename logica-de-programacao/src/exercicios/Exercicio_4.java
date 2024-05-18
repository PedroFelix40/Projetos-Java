package exercicios;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos dias você ficou com o carro: ");
        float dias = sc.nextInt();

        System.out.print("Quantos km você rodou com o carro: ");
        float km = sc.nextFloat();

        float valorAluguel = (float)(km*1.23)+(float) (dias * 86.75);

        System.out.printf("\nVocê irá pagar para a empresa %.2f", valorAluguel);
    }
}
