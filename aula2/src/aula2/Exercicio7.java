package aula2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 
			
		/* Exercicio 7 - Faça um programa que leia o nome de um vendedor, o seu salário fixo e o tatol de vendas efetuadas
		 * por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar
		 * o total a receber no final do mês, com duas casas decimais 
		 */
		
		// Entrada
		//System.out.println("Nome do vendedor");
		//String nome = entrada.nextLine();
		//System.out.println("Salario Fixo");
		//double salarioFixo = entrada.nextDouble();
		//System.out.println("Total de vendas");
		//double totalVendas = entrada.nextDouble();
		
		// processo
		//double comissao = 0.15 * totalVendas;
		//double salarioFinal = comissao + salarioFixo;
		
		//System.out.println("O funcionario " + nome + " e o salario é " + salarioFinal);
		// ou System.out.println("O funcionario " + nome + " e o salario é " + (comissao + salarioFixo));
		
		/* Exerciocio 8 - Uma pessoa foi ate uma casa de cambio trocar dolares por reias
		 * para isto ela entregou um valor em dolares para o ambiente, calcule quantos reais 
		 * o atendente deve devolver para a pessoa*/
		
		System.out.println("Digite o valor ");
		double valordolar = entrada.nextDouble();
		
		double dolar = 4.97;
		
		double valorFinal = valordolar * dolar;
		
		System.out.println("O atendende deve devolver em reias " + valorFinal);
		
		
	}

}
