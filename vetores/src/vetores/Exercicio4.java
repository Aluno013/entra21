package vetores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie uma array de 5 elementos e descubra: 
		 * a) Qual o maior elemento 
		 * b) Qual o menor elemento 
		 * c) A média dos elementos
		 */

		Scanner scan = new Scanner(System.in);
		
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;

		double[] vetor = new double[5];
		// vetor.length = tamanho do vetor (quantia de elementos)
		
		double soma = 0;
		for (int indice = 0; indice < vetor.length; indice++) {
			System.out.println("informe o valor");
			vetor[indice] = scan.nextDouble();
			soma = soma + vetor[indice];
			if (vetor[indice] < menor) {
				menor = vetor[indice];
			}
			if (vetor[indice] > maior) {
				maior = vetor[indice];
			}
		}	
		System.out.println("O maior valor é " + maior);
		System.out.println("O menor valor é " + menor);
		System.out.println("O maior valor é " + (soma/vetor.length));
	}
}
