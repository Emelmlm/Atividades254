/*a) Calcular a tangente de um ângulo (VALOR) em radianos
b) Calcular o arco seno do VALOR
c) Calcular o arco cosseno do VALOR*/

import java.util.Scanner;
public class exercicio_3 {
   public static void main(String[] args) {
       double valor, seno, cos, tan;
       Scanner ler = new Scanner (System.in);

       System.out.print("Digite um valor para calcular funções trigonométricas: ");
       valor = ler.nextDouble();

       //a)
       tan = Math.tan(valor);
       System.out.println("A tangente do valor é:" + tan);

       //b)
       seno = Math.sin(tan);
       System.out.println("O arco seno do valor é: " + seno);

       //c
       cos = Math.cos(seno);
       System.out.println("O arco cosseno do valor é: " + cos);


   }
}

