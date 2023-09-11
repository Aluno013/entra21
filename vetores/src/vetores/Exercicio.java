package vetores;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Solicite 3 notas e armazene em um vetor, depois imprima a média */

		Scanner scan = new Scanner(System.in);

		double notas[] = new double[3];

		System.out.println("informe as notas");
		notas[0] = scan.nextDouble();
		notas[1] = scan.nextDouble();
		notas[2] = scan.nextDouble();

		double soma = notas[0] + notas[1] + notas[2];

		System.out.println("A média é " + (soma / 3));

	}
}
