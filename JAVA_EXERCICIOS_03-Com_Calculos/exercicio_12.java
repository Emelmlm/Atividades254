/*Solicite ao usuário que digite o valor de um produto e aplique um acréscimo de 15%. Calcule o valor com
acréscimo e mostre o resultado */

import java.util.Scanner;
public class exercicio_12 {
    public static void main(String[] args) {
        
        double pro, acre;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite o valor do produto: ");
        pro = ler.nextDouble();

        acre = pro + (pro * 0.15);

        System.out.println("O valor do produto com um acréscimo de 15% é " + acre);
    }
}
