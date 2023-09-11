package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que pergunte em que turno você estuda. Peça para digitar
		 * M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem “Bom dia!” ou
		 * “Boa Noite” ou “Valor inválido”, conforme o caso.
		 */

		Scanner entrada = new Scanner(System.in);

		// entrada
		System.out.println("Digite o turno");
		System.out.println("Digigte M-matutino, V-vespertino, N-Noturno");
		String turno = entrada.next();

		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia");
		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa Tarde");
		} else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa Noite");
		} else {
			System.out.println("Valor invalido");
			}
		}

}
