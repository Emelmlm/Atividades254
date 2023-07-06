/*Elabore uma tabuada, sendo fornecido o número para a tabuado pelo usuário. A classe deve multiplicar este
número e mostrar o resultado*/

import java.util.Scanner;
public class exercicio_24 {
    public static void main(String[] args) {
        
        int num, i;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite um número: ");
        num = ler.nextInt();

        for ( i = 0; i <= 10 ;i++){
            System.out.println(num + "x" + i + "=" + (num*i));
        }
    }
}
