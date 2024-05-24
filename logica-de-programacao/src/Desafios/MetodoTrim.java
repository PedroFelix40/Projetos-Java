package Desafios;

import java.util.Scanner;

public class MetodoTrim {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("");
        System.out.println(nome.trim());
        System.out.println(nome);
    }
}
