package exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Date dateNow = new Date();

        int ano = dateNow.getYear() + 1900;

        System.out.print("Digite o ano em que você nasceu: ");
        int anoNascimento = sc.nextInt();

        int idade = ano - anoNascimento;

        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

//        Date formt = dataFormatada.parse(dateNow);
        System.out.print(STR."\nCom a data de hoje \{dataFormatada.format(dateNow)}, você atualmente tem \{idade}");

    }
}
