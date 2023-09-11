package aula4;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma 
		mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. 
		Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro 
  		diferente dos demais, e apenas irmãos se todas as idades forem diferentes.	 */
		
		Scanner entrada = new Scanner(System.in);
		
		// entrada
		System.out.println("Informe o ano de Nascimento dos 3 irmao");
		int irmao1 = entrada.nextInt();
		int irmao2 = entrada.nextInt();
		int irmao3 = entrada.nextInt();
		
		// processo
		if (irmao1 == irmao2 && irmao2 == irmao3) {
			System.out.println("São trigemeos");
		} else if (irmao1 == irmao3 || irmao2 == irmao3 || irmao1 == irmao2) {
			System.out.println("São gemeos");
		} else {
			System.out.println("Apenas irmaos");
		}
		}
	}