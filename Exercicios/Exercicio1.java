package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
//entrada
		System.out.println("Informe um valor");
		double valor = entrada.nextDouble();
		
// processo
		if (valor > 0) {
			System.out.println("O valor é positivo");
		} else if (valor < 0) {
			System.out.println("O valor é negativo");
		} else {
			System.out.println("O valor é 0");
			
		}
	}

}
