/*Solicite ao usuário que digite a quantidade de dias que um carro foi alugado e o valor da diária. Calcule o valor
total do aluguel. Em seguida, mostre o resultado.
 */

import java.util.Scanner;
public class exercicio_10 {
    public static void main(String[] args) {
        
        double diaria, dias, aluguel;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite a quantidade de dias: ");
        dias = ler.nextDouble();
        System.out.print("Digite o valor da diária: ");
        diaria = ler.nextDouble();

        aluguel = dias * diaria;

        System.out.println("O aluguel do carro ficom em " + aluguel);

    }
}
