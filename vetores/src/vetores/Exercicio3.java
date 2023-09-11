package vetores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um algoritmo em que quem preenche os valores do vetor é o usuário, por
		 * fim printe o vetor (vetor de 5 posições).
		 */

		Scanner entrada = new Scanner(System.in);	
		
		int tamanhoDoVetor = 5;
		String[] valores = new String[tamanhoDoVetor];
		// debug
		System.out.println("Tamanho do meu vetor: " + valores.length);
		for (int indice = 0; indice < valores.length; indice++) {
			System.out.println("informe um valor");
			valores[indice] = entrada.next();
		}
		for (int indice = (valores.length - 1); indice >= 0; indice--) {
			System.out.println(valores[indice]);
			
		}

	}
}


