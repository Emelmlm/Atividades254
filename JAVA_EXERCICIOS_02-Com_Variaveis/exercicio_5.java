/*Solicite ao usuário que digite um número decimal e, em seguida, imprima uma mensagem confirmando o número digitado. */

import java.util.Scanner;
public class exercicio_5 {
    public static void main(String[] args) {
        
        float num;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite um número decimal: ");
        num = ler.nextFloat();

        System.out.println("Você digitou " + num);

    }
}
