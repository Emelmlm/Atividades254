/*Solicite ao usuário que digite um número inteiro e calcule o cubo desse número. Em seguida, mostre o
resultado*/

import java.util.Scanner;
public class exercicio_14 {
    public static void main(String[] args) {
        
        int num, cubo;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite um número inteiro: ");
        num = ler.nextInt();

        cubo = num * num * num;

        System.out.println(cubo);
    }
}
