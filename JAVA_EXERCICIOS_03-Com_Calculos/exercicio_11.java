/*Solicite ao usuário que digite um número inteiro e calcule o quadrado desse número. Em seguida, mostre o
resultado. */

import java.util.Scanner;
public class exercicio_11 {
    public static void main(String[] args) {
        
        int num, qua;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite um número inteiro: ");
        num = ler.nextInt();

        qua = num * num;

        System.out.println(num +" ao quadrado é " + qua);

    }
}
