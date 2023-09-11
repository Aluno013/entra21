package ifelse;

import java.util.Scanner;

public class sesenao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Dados dois números inteiros descreva um algoritmo para informar o 
		maior valor entre eles. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite numero 1");
		int valor1 = entrada.nextInt();
		
		System.out.println("Digite numero 2");
		int valor2 = entrada.nextInt();
		
		if (valor1 > valor2) {
	    System.out.println("o valor 1º é maior que o 2°");
		} else if (valor1 < valor2) { // nunca usado sozinho
		System.out.println("o valor 2º é maior que o 1°");	
		} else {
			System.out.println("os valores são iguais");
		}
		}
	
		
	}

