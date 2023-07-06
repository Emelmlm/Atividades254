/*Solicite ao usuário que digite a sua altura em metros e o seu peso em quilogramas. Calcule o valor do IMC
(Índice de Massa Corporal) utilizando a fórmula: IMC = peso / (altura * altura). Em seguida, mostre o resultado. */

import java.util.Scanner;
public class exercicio_21 {
    public static void main(String[] args) {
        
        double alt, peso, imc;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite sua altura (metros): ");
        alt = ler.nextDouble();
        System.out.print("Digite seu peso (quilogramas): ");
        peso = ler.nextDouble();

        imc = peso / (alt * alt);

        System.out.println("Seu IMC é " + imc);
        
    }
}
