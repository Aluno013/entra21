package Exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class LacoExercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Crie 4 variáveis fora do For onde define se é m(mulher) e h(homem)
		 * e faça dois contador que verifique quantas mulheres e homens são */
		
		// entrada
  
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe 4 valores, sendo m(mulher) e h (homem)");
		
		int ContadorHomens = 0;
		int ContadorMulheres = 0;
		
		// processo
		
		for (int i = 0; i < 4; i++) {
			String val = entrada.next();
			if (val.equals("m")) {
				ContadorMulheres++;
			} else {
					ContadorHomens++;
				}
	}
		// saida
		System.out.println("Mulheres: " + ContadorMulheres);
		System.out.println("Mulheres: " + ContadorHomens);
	}
}

