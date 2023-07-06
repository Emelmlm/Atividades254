/*Solicite ao usuário que digite a quantidade de litros de combustível abastecidos e o valor do litro. Calcule o valor
total a ser pago. Em seguida, mostre o resultado. */

import java.util.Scanner;
public class exercicio_9 {
    public static void main(String[] args) {
        
        double qnt, pre, total;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite a quantidade de combustível abastecidos: ");
        qnt = ler.nextDouble();
        System.out.print("Digite o valor do litro: ");
        pre = ler.nextDouble();

        total = qnt * pre;

        System.out.println("O total a ser pago é " + total);
    }
}
