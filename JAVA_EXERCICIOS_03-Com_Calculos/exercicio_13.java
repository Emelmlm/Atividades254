/*Solicite ao usuário que digite o valor de um produto e a quantidade comprada. Calcule o valor total da compra.
Em seguida, mostre o resultado */

import java.util.Scanner;
public class exercicio_13 {
    public static void main(String[] args) {
        
        double pro, quant, valor;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite o valor do produto: ");
        pro = ler.nextDouble();
        System.out.print("Digite a quantidade comprada: ");
        quant = ler.nextDouble();

        valor = pro * quant;

        System.out.println("O total da compra é: "+ valor);
        
    }
}
