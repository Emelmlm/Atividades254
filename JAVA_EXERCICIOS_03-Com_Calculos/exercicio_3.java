/*Solicite ao usuário que digite a base e a altura de um triângulo e calcule a área do triângulo. Em seguida, mostre
o resultado. */

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {

        double base, altura, area;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        base = ler.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        altura = ler.nextDouble();

        area = (base * altura)/2;

        System.out.println("A área do trângulo é " + area);
    }
}
