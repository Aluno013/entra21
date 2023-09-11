package vetores;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  Crie um array de elementos e depois peça ao usuário para informar um valor, 
		 	verifique se este valor está presente no array e printe o índice. */
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe um valor");
			vetor[i] = scan.nextInt();
		}
		System.out.println("Informe um valor para ver se está presente");
		int variavelAux = scan.nextInt();
		
		boolean possuiElemento = false;
		for (int i = 0; i < vetor.length; i++) {
		if (vetor[i] == variavelAux) {
			possuiElemento = true;
			System.out.println("Indice: " + i);
		}
		}
		
		if (possuiElemento == false) {
			System.out.println("não tem");
		}
	}
}