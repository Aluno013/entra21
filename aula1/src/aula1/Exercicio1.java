package aula1;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner - Entrada de dados que o usuario coloca
		// Scanner entrada = new Scanner(System.in);

		// System.out.println("Qual é sua altura?");
		// int altura = entrada.nextInt();

		// System.out.println(altura);

		// final double pi = 3.14;

		// Exercicio 1 - Calcule a área da circunferencia elevando o calor do raio ao
		// quadrado e multiplicando por pi (3.14159)

		// importar
		// Scanner - Entrada de dados que o usuario coloca
		// Scanner entrada = new Scanner(System.in);

		// DecimalFormat formatar = new DecimalFormat("0.00");

		// definir variavel constante
		// final double pi = 3.14;

		// perguntar ao usuario o valor do raio
		// System.out.println("Qual é o raio?")/
		// double raio = entrada.nextDouble();

		// processo
		// double resultado = pi * (raio * raio);

		// saida
		// System.out.println("O resultado é " + formatar.format(resultado));

		// Exercicio 2 - Leia dois valores do ponto flutuante e calcule a média
		// ponderada sabendo que a nota A tem peso 3.5 e nota B 6.5

		// Scanner notas = new Scanner(System.in);

		// System.out.println("Digite a 1ª Nota: ");
		// double nota1 = notas.nextDouble();

		// System.out.println("Digite a 2ª Nota: ");
		// double nota2 = notas.nextDouble();

		// double pesoA = 3.5;
		// double pesoB = 6.5;

		// double media = (nota1 * pesoA + nota2 * pesoB) / (pesoA + pesoB); ou
		// double media = (nota1 * 6.5 + nota * 3.5) / 10;
		// System.out.println("A media é: " + media);

		// Exercicio 3 - Leia quatro valores inteiros A, B, C e D. A seguir, calcule e
		// mostre a diferença do produto de A e B pelo produto de C e D

		// Scanner valores = new Scanner(System.in);

		// Entrada
		// System.out.println("Digite valor A: ");
		// int A = valores.nextInt();
		// System.out.println("Digite valor B: ");
		// int B = valores.nextInt();
		// System.out.println("Digite valor C: ");
		// int C = valores.nextInt();
		// System.out.println("Digite valor D: ");
		// int D = valores.nextInt();

		// Processo
		// int produtoAB = A * B;
		// int produtoCD = C * D;
		// int diferenca = produtoAB - produCD;

		// saida
		// System.out.println("A resposta é " + diferenca);

		// Exercicio 4 - Escreva um programa que leia o número de um funcionario, seu
		// numero de horas trabalhadas
		// o valor que recebe por hora e calcule o salario desse funcionario. A seguir
		// mostre o numero e o salario do funcionario, com duas casas decimais

		/*Scanner dados = new Scanner(System.in);

		// Entrada
		System.out.println("Informe o numero do funcionario");
		int numero = dados.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas");
		int horas = dados.nextInt();
		System.out.println("Informe o valor recebido por horas trabalhadas");
		double valor = dados.nextDouble();

		double salario = horas * valor;

		// Saida * NÃO ESQUECER DECIMAL FORMAT
		System.out.println("O numero do funcionario é " + numero);
		System.out.println("O salario do funcionario é de " + salario);*/
		
		/* Exercicio 7 - Faça um programa que leia o nome de um vendedor, o seu salário fixo e o tatol de vendas efetuadas
		 * por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar
		 * o total a receber no final do mês, com duas casas decimais*/
		
		//Entrada 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do vendedor ");
		int nome = entrada.nextInt();
		
		System.out.println("Informe o salario do vendedor ");
		double salario = entrada.nextDouble();
		
		System.out.println("Informe o total de vendas");
		double vendas = entrada.nextDouble();
		

	}

}
