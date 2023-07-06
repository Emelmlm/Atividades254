/*Solicite ao usuário que digite a sua idade e, em seguida, imprima uma mensagem informando a idade fornecida */

import java.util.Scanner;
public class exercicio_3 {
    public static void main(String[] args) {

        double idade;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite a sua idade: ");
        idade = ler.nextDouble();

        System.out.println("Você tem " + idade + " anos.");
        
    }
}
