package aula7;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Descreva um algoritmo que vá lendo a altura de pessoas 
		 * até o usuário entrar com o número 0 
		Calcule a média de altura das mesmas. */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe altura");
		double altura = scan.nextDouble();
		
		int contador = 0;
		double soma = 0;
		
		while (altura != 0) {
			soma += altura;
			contador++;
			System.out.println("Informe altura");
			altura = scan.nextDouble();
		}
		double media = soma / contador;

		System.out.println("A media das altura é " + media);
		System.out.println(contador + " pessoas" );
	}
}