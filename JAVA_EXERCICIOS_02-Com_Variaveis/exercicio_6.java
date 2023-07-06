/*Solicite ao usuário que digite dois números inteiros e, em seguida, imprima uma mensagem mostrando os números
fornecidos. */

import java.util.Scanner;
public class exercicio_6 {
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite um número: ");
        num1 = ler.nextInt();
        System.out.print("Digite mais um número: ");
        num2 = ler.nextInt();

        System.out.println("Você digitou os números " + num1 + " e " + num2 + ".");
        
    }
}
