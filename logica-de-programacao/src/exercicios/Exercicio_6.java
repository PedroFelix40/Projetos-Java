package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random randomNum = new Random();

        int numberRa = randomNum.nextInt(900) + 100;

        char genero;
        System.out.print("Digite seu nome para cadastro: ");
        String nome = sc.next();

        String letra = nome.substring(0,1);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();


        do{
            System.out.print("Digite seu gênero: [M/F]: ");
            genero = sc.next().toLowerCase().charAt(0);
        }while(genero != 'm' && genero != 'f');

        System.out.print("Digite seu curso: ");
        String curso = sc.next();

        String ra = letra + numberRa;
        System.out.println(STR."\nSeu nome é \{nome} ele tem \{nome.length()}, sua idade é \{idade}, seu gênero é \{genero =='m' ? "masculino" : "feminino"}");
        System.out.println(STR."Você se increveu no curso de \{curso} com RA: \{ra}");

    }
}
