package Exercicios;

import java.util.Scanner;

public class LacoExercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa, utilizando for, em que o usuário tenha a opção de inserir
		 * dois valores e ocorra a subtração deles, deve ocorrer por 3 vezes.
		 */

		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {

		System.out.println("Digite o numero");
		int num1 = entrada.nextInt();

		System.out.println("Digite o numero");
		int num2 = entrada.nextInt();

		int resultado = 0;
		resultado = num1 - num2;

			System.out.println("O resultado é " + resultado);
		}
	}

}
