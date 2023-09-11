package aula4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Dada a idade de um nadador descreva um algoritmo que o classifique em uma das seguintes categorias: 
		pré-mirim 5 - 7 anos 
		mirim 8 - 10 anos 
		infantil 11 - 13 anos 
		infanto-juvenil 14 - 17 anos 
		juvenil 18 - 20 anos 
		adulto maiores de 21 anos */
		
		Scanner entrada = new Scanner(System.in);
		
		// entrada
		System.out.println("Informe sua Idade");
		int idade = entrada.nextInt();
		//String categoria;
		
		// processo
		if (idade >= 5 && idade <= 7) {
			System.out.println("pré-mirim");
			//categoria = "pré-mirim";
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("mirim");
			//categoria = "mirim";
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("infantil");
			//categoria = "infantil";
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("infanto-juvenil");
			//categoria = "infanto-juvenil";
		} else if (idade >= 18 && idade <= 20) {
			System.out.println("juvenil");
			//categoria = "juvenil";
		} else if (idade >= 21) {
			System.out.println("Adulto");
			//categoria = "Adulto";
		} else {
			System.out.println("Não pode nadar");
		}
		}
}

