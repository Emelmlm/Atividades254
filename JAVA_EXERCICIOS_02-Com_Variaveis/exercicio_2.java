/*Solicite ao usuário que digite o seu nome e, em seguida, imprima uma mensagem de boas-vindas utilizando o nome
fornecido. */

import java.util.Scanner;
public class exercicio_2 {
  public static void main(String[] args) {

    String nome;
    Scanner ler = new Scanner (System.in);

    System.out.print("Digite seu nome: ");
    nome = ler.nextLine();

    System.out.println("Seja bem vindo(a) " + nome + "!");
  }  
}
