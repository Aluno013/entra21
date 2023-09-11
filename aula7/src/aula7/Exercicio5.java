package aula7;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Construa um contador que comece com 0 onde ele precisa chegar ao numero 10, para o contador contar precisa-se que o valor seja valido, 
		   Faça um programa que receba um nome de uma fruta como entrada. 
		   Faça vários cases para as frutas que você conhece. 
		   Por exemplo: 
		   Case "banana": Eu gosto dessa fruta 
		   Case "pera": Eu não gosto dessa fruta  
		   Caso o usuário entre um valor desconhecido, escreva: Eu não conheço essa fruta e encerre o programa
		   Descreva um algoritmo que leia vários números caso o usuário informe a letra s e encerre somente somente quando o usuário digitar n e e por fim
		   a) escreva o menor valor  
		   b) escreva o maior valor
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a fruta");
		String fruta = scan.next();

		while (fruta.equals("banana") || fruta.equals("pera") || fruta.equals("uva") || fruta.equals("morango")) {
			
		}
		
		switch (fruta) {
		case "banana":
			System.out.println("Eu gosto dessa fruta");
			break;
		case "pera":
			System.out.println("Eu não gosto dessa fruta");
			break;
		case "uva":
			System.out.println("Eu gosto dessa fruta");
			break;
		case "morango":
			System.out.println("Eu não gosto dessa fruta");
			break;
			
			default:
				System.out.println("Valor invalido");
				break;
		}
	}
			
}