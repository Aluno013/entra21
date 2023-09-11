package vetores;

import java.util.Iterator;
import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		/*vetores e matrizes*/
		
		// formula
		//tipo[] nomeDaVariavel = new tipo[tamanho]
	
		/*int idades[] = new int[4];
		
		idades[0] = 10;
		idades[1] = 11;
		idades[2] = 12;
		idades[3] = 13;
		
		int soma = idades[0] +idades[1] + idades[2] + idades[3];
	
		//System.out.println("A soma é " + soma);
		  System.out.println("A média é " + (soma / 4));
		
		for (int i = 0; i < i; i++) {
			System.out.println(idades[i]);
			// imprimir idades pelo laço de repetição
		-------------------------------------------------------------------------*/
		
		// criar vetor de String - tamanho 3 - nome de pessoas próximas
		
		/*String nome[] = new String[2];
		
		nome[0] = "fernando";
		nome[1] = "Sabrina";
		
		for (int a = 0; a < 3; a++) {
			System.out.println(nome[a]);
			// imprimir idades pelo laço de repetição
		}---------------------------------------------------------------------------*/
		
		
		String alunos[] = new String[21];
		
		for (int i = 0; i < 21; i++) {
			System.out.println("informe os nomes");
			alunos[i] = scan.next();
	}
		for (int i = 0; i < 21; i++) {
			System.out.println(alunos[i]);
			
		}
		
	}		
}
