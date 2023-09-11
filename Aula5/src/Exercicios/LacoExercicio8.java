package Exercicios;

import java.util.Scanner;

public class LacoExercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Crie um programa para ler 3 notas e mostrar a média delas.*/
		
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		double notas = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Digite as notas");
			notas = scan.nextDouble();
		soma += notas; // soma = soma + entrada;
		}
		double media = soma / 3;
		System.out.println("A média é " + media);
	}

}
