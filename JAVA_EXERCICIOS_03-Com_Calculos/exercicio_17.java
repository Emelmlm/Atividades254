/*. Solicite ao usuário que digite o valor de um produto e a quantidade de parcelas desejada. Calcule o valor de
cada parcela. Em seguida, mostre o resultado. */

import java.util.Scanner;
public class exercicio_17 {
    public static void main(String[] args) {
        
        double pro, par, valor;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite o valor de um produto: ");
        pro = ler.nextDouble();
        System.out.print("Digite a quantidade de parcelas desejada: ");
        par = ler.nextDouble();

        valor = pro/par;

        System.out.println("O valor de cada parcela é " + valor);
    }
}
