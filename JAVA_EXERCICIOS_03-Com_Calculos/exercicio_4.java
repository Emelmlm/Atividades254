/*Solicite ao usuário que digite uma temperatura em graus Celsius e converta para Fahrenheit. Em seguida,
mostre o resultado */

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {

        double cel, fah;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma temperatura em graus Celsius: ");
        cel = ler.nextDouble();

        fah = (cel * 1.8) + 32;

        System.out.println("Em fahrenheit ficou: " + fah);

    }
}
