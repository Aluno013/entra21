package aula7;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa
		 * digitar um número diferente, mostrar a mensagem "entrada inválida" e
		 * solicitar o número novamente. Se digitar correto mostrar o número digitado.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe os valores entre 12 e 20");
		int num = scan.nextInt();
		
		while (num < 12 || num > 20) {
			System.out.println("Invalido, Informe o valor novamente");
			num = scan.nextInt();
		}
		System.out.println("Valor Correto");
	}
}