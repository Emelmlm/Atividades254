/*Solicite ao usuário que digite a sua idade e a quantidade de meses que ele viveu. Calcule o número aproximado
de dias que ele viveu. Em seguida, mostre o resultado */

import java.util.Scanner;
public class exercicio_19 {
    public static void main(String[] args) {
        
        double idade, meses, dias;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite a sua idade: ");
        idade = ler.nextDouble();
        System.out.print("Digite a quantidade de meses que viveu: ");
        meses = ler.nextDouble();

        idade = idade * 365.25;
        meses = meses * 30.4;
        dias = idade + meses;

        System.out.println("A quantidade de dias vividos foram de " + dias + " dias.");

    }
}
