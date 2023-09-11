package aula7;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie um programa que leia um número do teclado até que encontre um número
		 * igual a zero. No final, mostre a soma dos números digitados.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe valores");
		int num = scan.nextInt();
		int soma = 0;
		
		while (num != 0) {
		soma += num;
		System.out.println("Informe valores");
		num = scan.nextInt();
		
		}

		System.out.println("fim");
		System.out.println("O resultado é " + soma);
	}

}
