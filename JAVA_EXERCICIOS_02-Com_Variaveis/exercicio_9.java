/*Solicite ao usuário que digite o NOME, endereço separado por: NOME DA RUA, NUMERO, CEP, CIDADE, ESTADO,
também, o CPF e TELEFONE CELULAR */

import java.util.Scanner;
public class exercicio_9 {
   public static void main(String[] args) {
    
    String nome, nomerua, cidade, estado;
    double cpf, cep, cel, numrua;
    Scanner ler = new Scanner (System.in);

    System.out.print("Digite seu nome: ");
    nome = ler.nextLine();

    System.out.println("Insira seu endereço abaixo:");
    System.out.print("Nome da rua: ");
    nomerua = ler.nextLine();
    System.out.print("Número da rua: ");
    numrua = ler.nextDouble();
    System.out.println("Cidade: ");
    cidade = ler.nextLine();
    System.out.println("Estado: ");
    estado = ler.nextLine();
    System.out.print("CEP: ");
    cep = ler.nextDouble();
    System.out.print("CPF: ");
    cpf = ler.nextDouble();
    System.out.print("Telefone Celular: ");
    cel = ler.nextDouble();

    System.out.println("Nome:.........." + nome);
    System.out.println("Endereço:......" + nomerua + ", " + numrua + ", " + cep );
    System.out.println("Cidade:........" + cidade);
    System.out.println("Estado:........" + estado);
    System.out.println("CPF:..........." + cpf);
    System.out.println("Tel. Celular:.." + cel);



   } 
}
