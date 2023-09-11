package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escreva um algoritmo em que o usuário entra com um número. 
		Depois ele escolhe a operação que vai ser feita com esse número 
		Caso ele escolha a operação 1 
		Modifique a variável do número entrado e some 10 ao número original 
		Caso ele escolha a operação 2 
		Modifique a variável do número entrado e subtraia 10 do número original 
		Caso ele escolha a operação 3 
		Modifique a variável do número entrado e multiplique 10 ao número original 
		Caso ele escolha a operação 4, Modifique a variável do número entrado e divida 10 do número original */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor");
		double num = entrada.nextDouble();
		
		System.out.println("Escolha a função");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		int operacao = entrada.nextInt();
		
		switch (operacao) {
		case 1:
			num += 10;
			break;
		case 2:
			num -= 10;
			break;
		case 3:
			num *= 10;
			break;
		case 4:
			num /= 10;
			break;
		default:
			System.out.println("Operação invalida");
			break;
		}
		System.out.println("O resulto é " + num);
	}

}
