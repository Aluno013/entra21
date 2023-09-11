package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		// entrada
		System.out.println("Digigte f para feminino e m para masculino");
		String inf = entrada.next();

		// processo
		if (inf.equalsIgnoreCase("f")) {
			System.out.println("feminino");
		} else if (inf.equalsIgnoreCase("m")) {
			System.out.println("masculino");
		} else {
			System.out.println("invalido");
			}
		}
		
	}
