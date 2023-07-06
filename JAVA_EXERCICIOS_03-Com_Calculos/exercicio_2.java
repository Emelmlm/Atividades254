//Solicite ao usuário que digite o raio de um círculo e calcule a área do círculo. Em seguida, mostre o resultado.

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {

        double raio, area;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        raio = ler.nextDouble();

        area = (raio * raio) * Math.PI ;

        System.out.println("O valor da área do circulo é " + area);

    }
}