/*. Solicite ao usuário que digite o valor do lado de um quadrado e calcule a área desse quadrado. Em seguida,
mostre o resultado. */

import java.util.Scanner;
public class exercicio_20 {
    public static void main(String[] args) {
        
        double lado, area;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite o valor de um lado do quadrado: ");
        lado = ler.nextDouble();

        area = lado * lado;

        System.out.println("A área do quadrado é de " + area);
    }
}
