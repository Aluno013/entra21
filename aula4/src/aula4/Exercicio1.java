package aula4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a letra");
		String letra = entrada.next();
				
		/* letra minuscula
		letra =  letra.toLowerCase(); */

		/* letra maiuscula
		letra = letra.toUpperCase(); */
		
		// processo

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") ||
				letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("A letra é vogal");
		} else {
			System.out.println("A letra é consoate");
		}
	}

}