package Exercicios;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Caso tnha uma escola de fudamental II e queira separar os alunos por sala

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a sala");
		int salaAluno = entrada.nextInt();
		double contador = 0;
		
		switch (salaAluno) {
		case 7:
			System.out.println("setimo ano");
			break;
		case 8:
			System.out.println("oitavo ano");
			break;
		case 9:
			System.out.println("nono ano");
			break;
		default:
			System.out.println("Valor invalido");
			break;
		}
		
	}

}
