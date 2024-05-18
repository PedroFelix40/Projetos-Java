package exercicios;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.print(STR."\{nome}, por favor, digite seu RA: ");
        String ra = sc.next();

        float notas[] = new float[3];
        float mediaNotas = 0.00F;
        for ( int i = 0 ; i < 3 ; i++ )
        {
            System.out.print(STR."Digite sua \{i + 1}º: ");
            notas[i] = sc.nextFloat();

            mediaNotas += notas[i];
            if ( i == 2)
            {
                mediaNotas = mediaNotas/3;
            }
        }


        System.out.print(STR."Querido aluno \{nome} do RA \{ra}, sua média foi igual a \{mediaNotas}.");
        System.out.printf("Querido aluno %s do RA %s, sua média foi igual a %.2f.%n", nome, ra, mediaNotas);

        System.out.println("Obrigado pela atenção!");
    }
}
