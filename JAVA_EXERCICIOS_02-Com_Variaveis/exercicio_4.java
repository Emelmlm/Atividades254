/*Solicite ao usuário que digite um número inteiro e, em seguida, imprima uma mensagem confirmando o número digitado. */

import java.util.Scanner;
public class exercicio_4 {
    public static void main(String[] args) {
        
        int num;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        num = ler.nextInt();

        System.out.println("Você digitou o número " + num + ".");
    }
}
