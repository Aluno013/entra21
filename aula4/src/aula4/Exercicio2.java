package aula4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Para doar sangue é necessário ter entre 18 e 67 anos. Faça um 
		aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar 
		sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&)	 */
			
		Scanner entrada = new Scanner(System.in);

		// processo
		System.out.println("Informe sua Idade");
		int idade = entrada.nextInt();
		
		// processo
		if (idade >= 18 && idade <= 67) {
			System.out.println("Voce pode doar sangue");
		} else {
			System.out.println("Voce não pode doar sangue");
		}
		}
	}