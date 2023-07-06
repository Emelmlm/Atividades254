/*Solicite ao usuário que digite o valor de um produto e aplique um desconto de 10%. Calcule o valor com
desconto e mostre o resultado. */

import java.util.Scanner;
public class exercicio_8 {
    public static void main(String[] args) {
        
        double produto, desconto;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite o valor do seu produto: ");
        produto = ler.nextDouble();

        desconto = (produto * 10)/100;

        System.out.println("O valor com desconto de 10% é " + desconto);
    }
}
