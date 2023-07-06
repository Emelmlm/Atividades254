/*Faça um programa que converte de dólar para moeda real e exibe para o usuário o resultado */

import java.util.Scanner;
public class exercicio_25 {
    public static void main(String[] args) {
        
        double dol, real;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite um valor em dólar: ");
        dol = ler.nextDouble();

        real = dol*4.78;

        System.out.println("O mesmo valor em reias é " + real);

    }
}
