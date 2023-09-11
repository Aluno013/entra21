package aula4;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Faça uma calculadora. 
		O usuário entra com dois números e depois com a operaçao desejada. 
		Caso o número da operação seja 1: some os dois números. 
		Caso seja 2: subtraia os dois números. 
		Caso seja 3: multiplique os dois números. 
		Caso seja 4: divida os dois números.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o numero");
		double num1 = entrada.nextDouble();
		System.out.println("Informe o numero");
		double num2 = entrada.nextDouble();
		double resultado = 0;
		
		int funcao = entrada.nextInt();
		System.out.println("Escolha a função");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		
		if (funcao == 1) {
			resultado = num1 + num2;
		} else if (funcao == 2) {
			resultado = num1 - num2;
		} else if (funcao == 3) {
			resultado = num1 * num2;
		} else if (funcao == 4) {
			resultado = num1 / num2;
		} else {
			System.out.println("funcao Invalida");
			}
		System.out.println("O resultado é " + resultado);
			}
			
		}


