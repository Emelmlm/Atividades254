/*Solicite ao usuário que digite a quantidade de horas trabalhadas em um dia e o valor da sua hora de trabalho.
Calcule o salário diário. Em seguida, mostre o resultado. */

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {

        double hora, valor, sal;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite suas horas trabalhadas: ");
        hora = ler.nextDouble();
        System.out.print("Digite o valor da sua hora de trabalho: ");
        valor = ler.nextDouble();

        sal = valor * hora;

        System.out.println("O salário diário é de " + sal);

    }
}
