package exercicios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaPreco {
    public static void main(String[] args)
    {

        float primeiroProduto, segundoProduto, media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro jogo: ");
        primeiroProduto = sc.nextFloat();

        System.out.print("Digite o valor do segundo jogo: ");
        segundoProduto = sc.nextFloat();

        media = (primeiroProduto + segundoProduto) / 2;

        Locale localBrasil = new Locale("pt", "BR");
        NumberFormat dinheiroLocal = NumberFormat.getCurrencyInstance(localBrasil);

        System.out.println(STR."A média foi \{dinheiroLocal.format(media)}\n");

        System.out.printf("A média de preço dos produtos é %.2f\n", media);


    }
}
