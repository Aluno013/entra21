package Exercicios;

import java.util.Scanner;

public class Exercicios7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/* Faça um programa que pergunte o preço de três produtos e informe qual 
		produto você deve comprar, sabendo que a decisão é sempre o mais barato.
		 */
		
		Scanner entrada = new Scanner(System.in);

		// processo
		System.out.println("Informe sua Idade");
		int idade = entrada.nextInt();
		
		// processo
		if (idade >= 18 && idade <= 67) {
			System.out.println("Voce pode doar sangue");
		} else {
			System.out.println("Voce não pode doar sangue");
		}
		}
	}