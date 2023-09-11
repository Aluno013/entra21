package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que recebe a nota do aluno e retorna: A mensagem “Aprovado”,
		 * se a média alcançada for maior ou igual a sete; A mensagem “Aprovado com
		 * Distinção”, se a média for igual a dez; A mensagem “Reprovado” se a média for
		 * menor de do que sete; e calcule a frequencia de faltas
		 */

		Scanner entrada = new Scanner(System.in);

		// entrada
		System.out.println("Informe a media");
		double media = entrada.nextInt();
		System.out.println("Informe a frequencia");
		int frequencia = entrada.nextInt();

		// processo

		if (media < 7 || frequencia < 75) {
			System.out.println("Reprovado");
		} else if (media == 10 && frequencia >= 75) {
			System.out.println("Aprovado com distinção");
		} else if (media > 10) {
			System.out.println("Invalido");
		} else if (media >= 7 && frequencia >= 75) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}

}
