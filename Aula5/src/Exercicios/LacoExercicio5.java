package Exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class LacoExercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Faça um programa, utilizando for, que peça para o usuário 
		 * inserir um número N e mostre na tela todos os números ímpares até N.*/
		
		Scanner entrada = new Scanner(System.in);

		// entrada
		System.out.println("Digite um numero");
		int num = entrada.nextInt();
		
		// processo
		for (int i = 1; i <= num; i += 2) {
				System.out.println(i);
		}
	}
		
}	

