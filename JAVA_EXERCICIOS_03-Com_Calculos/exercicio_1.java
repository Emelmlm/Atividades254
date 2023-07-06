//Solicite ao usuário que digite dois números inteiros e realize a soma entre eles. Em seguida, mostre o resultado

import java.util.Scanner;
public class exercicio_1 {
public static void main(String[] args) {

        int num1, num2, resul;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        num1 = ler.nextInt();
        System.out.print("Digite outro número inteiro: ");
        num2 = ler.nextInt();

        resul = num1 + num2;

        System.out.println("A soma desses números é: " + resul);

    }
}