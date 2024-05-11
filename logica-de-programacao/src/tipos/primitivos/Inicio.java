package tipos.primitivos;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;


public class Inicio {
    public static void main(String[] args)
    {
        // Criar uma instância do Scanner para podermos armazenar dados a uma variável
        Scanner scanner = new Scanner(System.in);

        // Definindo as variáveis
        String nome;
        int idade;
        float altura;

        // Imprimindo na tela
        System.out.print("Digite seu nome: ");
        // Guardando o que foi digitado pelo usuário
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if(idade >= 18)
        {
            System.out.println("Sua idade permite entrar na festa!!");
        }else{
            System.out.println("Você é menor de idade, não pode entrar na festa!!");
        }

        // Imprimindo na tela os dados que foram obtidos
        System.out.println(STR."Olá \{nome}, você tem \{idade} anos");
        }
}
