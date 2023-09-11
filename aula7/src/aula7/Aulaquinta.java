package aula7;

import java.util.Scanner;

public class Aulaquinta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma opção");
		char opcao = entrada.next().charAt(0);
		
		double variavelAuxiliar = 0;
		
		while(opcao != 'n'){
			System.out.println("Informe dois valores");
			double valorUm = entrada.nextDouble();
			double valorDois = entrada.nextDouble();
			
			System.out.println("Insira a operação desejada");
			int operação = entrada.nextInt();
			
			switch (operação) {
			case 1:
				variavelAuxiliar = valorUm + valorDois;
				break;
			case 2:
				variavelAuxiliar = valorUm - valorDois;
				break;
			case 3:
				variavelAuxiliar = valorUm * valorDois;
				break;
			case 4:
				variavelAuxiliar = valorUm / valorDois;
				break;
			default:
				System.out.println("Operaço invalida");
				break;
			}
			System.out.println("O resultado é " + operação);
			operação = entrada.nextInt();
		}
		
		System.out.println("Fim");
		
	}

}
