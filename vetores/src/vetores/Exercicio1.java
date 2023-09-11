package vetores;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do seu índice e printe o vetor. 
		 * Ex:
		 * [0] = 0
		 * [1] = 1
		 * [2] = 4
		 * [3] = 9 */
		
		// indice == posição (vetor[0], vetor [1]...)
		// tipo[] nome = new tipo[tamanho do vetor]
		int tamanhoVetor = 10;
		int[] vetor = new int[tamanhoVetor];
		// posição final = tamanho -1;
		
		// System.out.println(vetor[0]); - imprimindo o valor de UMA variaveis
		for (int indice = 0; indice < 10; indice++) {
			vetor[indice]  = indice * indice;
	}
		
		for (int indice = 0; indice < 10; indice++) {
			System.out.println(vetor[indice]);
			
		}
	}
}
