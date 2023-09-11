package aula4;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
		(considere que a idade entre homens e mulheres sempre serão 
		diferentes). Calcule e escreva a soma das idades do homem mais velho 
		com a mulher mais nova, e o produto das idades 
		do homem mais novo com a mulher mais velha. */
		
		Scanner entrada = new Scanner(System.in);
		
		// entrada
		System.out.println("Informe a idade dos 2 homes");
		int homem1 = entrada.nextInt();
		int homem2 = entrada.nextInt();
		
		System.out.println("Informe a idade das 2 Mulheres");
		int mulher1 = entrada.nextInt();
		int mulher2 = entrada.nextInt();
		
		int soma = 0;
		int produto = 0;
		
		//proceso
		
		if (homem1 > homem2 && mulher1 > mulher2) {
			soma = homem1 + mulher2;
			produto = homem2 * mulher1;
		} else if (homem2 > homem1 && mulher1 > mulher2) {
			soma = homem2 + mulher2;
			produto = homem1 * mulher1;
		} else if (homem1 > homem2 && mulher2 > mulher1) {
			soma = homem1 + mulher1;
		} else {
			soma = homem2 + mulher1;
			produto = homem1 * mulher2;
		}
		System.out.println("A soma " + soma);
		System.out.println("O produto " + produto);
			
	}

}
