package vetores;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu e por fim printe o vetor. */
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = {1, 2, 3, 4, 5};
		
		System.out.println("Escolha um indice");
		int indice = scan.nextInt();
		// indice que o usuario escolheu coloque o numero 0
		vetor[indice] = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
	}

}
