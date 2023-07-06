/*Solicite ao usuário que digite a sua altura em metros e o seu peso em quilogramas. Calcule o índice de massa
corporal (IMC). Em seguida, mostre o resultado. */

import java.util.Scanner;
public class exercicio_15 {
    public static void main(String[] args) {
        
        double alt, peso, imc;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite sua altura em metros: ");
        alt = ler.nextDouble();
        System.out.print("Digite seu peso em quilogramas: ");
        peso = ler.nextDouble();

        imc = peso / (alt * alt);

        System.out.println("O seu imc é " + imc);
    }
}
