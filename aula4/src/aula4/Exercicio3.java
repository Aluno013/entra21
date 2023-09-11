package aula4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  Faça um programa que pergunte o preço de três produtos e informe qual 
		produto você deve comprar, sabendo que a decisão é sempre o mais 
		barato. */
		
		Scanner entrada = new Scanner(System.in);
		
		// entrada
		System.out.println("Informe o valor 1");
		double valor1 = entrada.nextDouble();
		System.out.println("Informe o valor 2");
		double valor2 = entrada.nextDouble();
		System.out.println("Informe o valor 3");
		double valor3 = entrada.nextDouble();
		
		String qualProdutoComprar = "";
		
		// processo
		if (valor1 < valor2 && valor1 <valor3) {
			qualProdutoComprar = "produto 1";
		} else if (valor2 < valor3) {
			qualProdutoComprar = "produto 2";
		} else {
			qualProdutoComprar = "produto 3";	
		}
		
		//saida
		System.out.println("O produto que deve comprar é " + qualProdutoComprar);
	}
}

