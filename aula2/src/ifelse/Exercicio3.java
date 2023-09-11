package ifelse;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		/*
		 * Faça um algoritmo que imprima "nome correto" caso o nome inserido seja o seu
		 */
		
		System.out.println("Digite o nome");
		String nome = entrada.nextLine();
		
		String nomecorreto = "fernando";

		if (nome.equalsIgnoreCase(nomecorreto)) {
			System.out.println("nome correto");
		} else { // nunca usado sozinho
			System.out.println("nome incorreto");
		}

	}

}
