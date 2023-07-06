/*a) Arredondar um número para cima:
 b) Arredondar um número para baixo:*/

import java.util.Scanner;
public class exercicio_2 {
   public static void main(String[] args) {
       double num, arrecima, arrebaixo, i;
       Scanner ler = new Scanner (System.in);

       System.out.print("Digite um número para ser arredondado: ");
       num = ler.nextDouble();

       System.out.println(Math.round(num));

   }
}
