package vetores;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Crie um array de 10 elementos e depois peça ao usuário para informar um índice, 
		 * imprima o o valor que está no vetor conforme indice informado pelo usuario */
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = {0, 10, 2, 83, 4, 97, 54, 20, 8, 9};
		// entrada - ao usuario indice para informar um
		System.out.println("Informe um indice");
		int indice = scan.nextInt();
		// imprima o valor que esta no vetor conforme indice
		System.out.println(vetor[indice]);
			
	}
}
