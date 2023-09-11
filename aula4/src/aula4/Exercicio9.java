package aula4;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um 
		algoritmo para ler as idades dos filhos e exibir quem é o mais velho, o 
		irmão do meio e o caçula da família. Suponha que não haja empates. */
		
		Scanner entrada = new Scanner(System.in);
		
		// entrada
		System.out.println("Informe a idade de marquinhos");
		int marquinhos = entrada.nextInt();
		System.out.println("Informe a idade de zezinho");
		int zezinho = entrada.nextInt();
		System.out.println("Informe a idade de luluzinha");
		int luluzinha = entrada.nextInt();
		
		String velho = "";
		String meio = "";
		String cacula = "";
		
		// processo
		if (marquinhos > zezinho && marquinhos > luluzinha) {
			if (zezinho > luluzinha) {
				meio = "Zezinho";
				cacula = "Luluzinha";
			} else {
				meio = "Luluzinha";
				cacula = "Luluzinha";
			}
			velho = "Marquinhos";
		} else if (zezinho > luluzinha) {
			if (marquinhos > luluzinha) {
				meio = "Marquinhos";
				cacula = "Luluzinha";
			} else {
				cacula = "Marquinhos";
			}
			velho = "Zezinho";
		} else {
			if (marquinhos > zezinho) {
				meio = "Marquinhos";			
		}	
			System.out.println("O irmao mais velho é " + velho);
			System.out.println("O irmao do meio é " + meio);
			System.out.println("O irmao mais novo é " + cacula);
		}
	}
}
