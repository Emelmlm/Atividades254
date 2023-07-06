/*Use as funções SQRT e POW da classe MATH para calcular a raiz quadrada e elevar os números as suas
devidas potências.*/

import java.util.Scanner;

public class exercicio_23 {
    public static void main(String[] args) {

        double num, raiz, pot;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = ler.nextDouble();
        raiz = Math.sqrt(num);
        pot = Math.pow(num, 2);
        System.out.print(String.format("A raiz é %.2f e a potência é %.2f", raiz, pot));
        
    }
}
