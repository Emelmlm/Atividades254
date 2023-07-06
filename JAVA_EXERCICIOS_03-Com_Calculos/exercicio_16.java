/*Solicite ao usuário que digite o valor de um produto e a porcentagem de desconto. Calcule o valor com desconto
aplicado. Em seguida, mostre o resultado. */

import java.util.Scanner;
public class exercicio_16 {
    public static void main(String[] args) {
        
        double pro, por, desc;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite o valor do produto: ");
        pro = ler.nextDouble();
        System.out.print("Digite a porcentagem do desconto: ");
        por = ler.nextDouble();

        desc = (pro * por)/100;

        System.out.println("O valor do produto com desconto é de " + desc);
    }
}
