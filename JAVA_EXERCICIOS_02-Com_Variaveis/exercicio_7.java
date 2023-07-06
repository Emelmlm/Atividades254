/*Solicite ao usuário que digite o seu nome, idade e cidade onde reside, e em seguida, imprima uma mensagem utilizando
essas informações.*/

import java.util.Scanner;
public class exercicio_7 {
    public static void main(String[] args) {
        
        String nome, cidade;
        double idade;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.print("Digite sua cidade: ");
        cidade = ler.nextLine();
        System.out.print("Digite sua idade: ");
        idade = ler.nextDouble();

        System.out.println(nome + " tem " + idade + " anos e mora em " + cidade + ".");
    }
}
