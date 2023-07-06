/*Solicite ao usuário que digite um número inteiro e um número decimal, e em seguida, imprima uma mensagem mostrando
os números fornecidos */

import java.util.Scanner;
public class exercicio_8 {
    public static void main(String[] args) {
        
        int numint;
        double numdec;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numint = ler.nextInt();
        System.out.print("Digite um número decimal: ");
        numdec = ler.nextDouble();

        System.out.println("número decimal: " + numdec + ", número inteiro: " + numint + ".");
    }
}
