/*Solicite ao usuário que digite a quantidade de dias, horas, minutos e segundos. Calcule o total de segundos. Em
seguida, mostre o resultado. */

import java.util.Scanner;
public class exercicio_6 {
    public static void main(String[] args) {
        
        double dia, hora, min, seg;
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite a quantidade de dias: ");
        dia = ler.nextDouble();
        System.out.print("Digite a quantidade de horas: ");
        hora = ler.nextDouble();
        System.out.print("Digite a quantidade de minutos: ");
        min = ler.nextDouble();
        System.out.print("Digite a quantidade de segundos: ");
        seg = ler.nextDouble();

        dia = dia * 86400;
        hora = hora * 3600;
        min = min * 60;

        System.out.println("a soma dos segundos é de " + (dia + hora + min + seg));
    }
    
}
