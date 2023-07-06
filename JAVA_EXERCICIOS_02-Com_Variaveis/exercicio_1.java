/*Faça um programa que peça para o usuário digitar o nome e a cidade que ele mora, e apresente na tela a mensagem: Olá
_______________, você mora na cidade de ________________.*/

import java.util.Scanner;
public class exercicio_1 {
    public static void main(String[] args) {
        
        String nome, cidade;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.print("Digite sua cidade: ");
        cidade = ler.nextLine();

        System.out.println("Seu nome é " + nome + " e sua cidade é " + cidade + ".");
    }
}
