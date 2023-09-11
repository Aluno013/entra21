package aula4;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Escreva um algoritmo que obtém do usuário 3 valores inteiros  representando as três 
		cartas deste usuário em uma mão de jogo de truco (1= AS; 2=2; 3=3; 7=7; 
		11= Valete; 12= Dama; 13= Rei).O algoritmo deve imprimir na tela a palavra 
		“TRUCO” (se APENAS UMA das três cartas for AS, 2 ou 3), “SEIS” 
		(se APENAS DUAS  das três cartas for AS, 2 ou 3) ou “NOVE” (se AS TRÊS cartas forem AS, 2 ou 3). Se 
		não houver AS, 2 ou 3 nas três cartas, não é impresso nada */
		
		Scanner entrada = new Scanner(System.in);
		
		// entrada
		System.out.println("Digite o valor 1");
		int valor1 = entrada.nextInt();
		System.out.println("Digite o valor 2");
		int valor2 = entrada.nextInt();
		System.out.println("Digite o valor 3");
		int valor3 = entrada.nextInt();
		
		//processo
		if ((valor1 == 1 || valor2 == 1 || valor3 == 1) &&
			(valor1 == 2 || valor2 == 2 || valor3 == 2) && 
			(valor1 == 3 || valor2 == 3 | valor3 == 3)) {
			System.out.println("NOVE");
		} else if ((valor1 < 4 && valor2 < 4) || (valor1 < 4 && valor3 < 4)
				|| (valor2 < 4 && valor3 < 4)) {
			System.out.println("SEIS");
		} else if (valor1 == 1 || valor2 == 1 || valor3 == 1 || valor1 == 2
				|| valor1 == 3 || valor2 == 3 || valor3 == 3) {
			System.out.println("TRUCO");	
		} else {
			System.out.println("nada");
			}
		}
		

}
