package aula7;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  Escreva um algoritmo que leia um número do 
		 teclado até que encontre um número menor ou igual a 1. */
		
		Scanner scan = new Scanner(System.in);
	
		int num = 0;
		System.out.println("Informe valores");
		num = scan.nextInt();
		
		while (num > 1) {
			System.out.println("Informe valores");
			num = scan.nextInt();
		}
		System.out.println("fim");
	}

}
