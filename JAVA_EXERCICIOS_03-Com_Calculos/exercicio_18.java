/*Solicite ao usuário que digite a sua idade e em que ano estamos, e em seguida, mostre uma mensagem
mostrando o ano de nascimento */

import java.util.Scanner;
public class exercicio_18 {
    public static void main(String[] args) {
        
        int idade, ano, nasc;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.print("Digite o ano que estamos: ");
        ano = ler.nextInt();

        nasc = ano - idade;

        System.out.println("Você nasceu no ano de " + nasc);

    }
}
