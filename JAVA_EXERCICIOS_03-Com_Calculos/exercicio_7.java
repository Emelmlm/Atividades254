/*Solicite ao usuário que digite dois números inteiros e realize a multiplicação entre eles. Em seguida, mostre o
resultado. */

import java.util.Scanner;
public class exercicio_7 {
    public static void main(String[] args) {
        
        int num, num2, resul;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite um número: ");
        num = ler.nextInt();
        System.out.print("Digite outro número: ");
        num2 = ler.nextInt();

        resul = num * num2;

        System.out.println(num + " multiplicado por " + num2 + " resulta em " + resul);

    }
    
}
