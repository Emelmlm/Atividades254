/*Use as funções SQRT e POW da classe MATH para calcular a raiz quadrada e elevar os números as suas
devidas potências. */

import java.util.Scanner;
public class exercicio_22 {
    public static void main(String[] args) {
        
        double n1, n2;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite um número: ");
        n1 = ler.nextDouble();
        System.out.print("Digite outro número: ");
        n2 = ler.nextDouble();

        if (n1 > n2){
            System.out.println(n1 + " é o número maior.");
        }else{
            System.out.println(n2 + " é o número maior.");
        }
        
    }
}
