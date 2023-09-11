package ifelse;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercicio 3 Dados dois valores inteiros, escreva um algoritmo que informe se eles 
		//são múltiplos ou não.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe valor");
		int valor = entrada.nextInt();
	
		if (valor % 2 == 0) {
			System.out.println("Valor é par"); //verdade
		} else {
			System.out.println("Valor é impar"); //falso
		}

	}
		
}
