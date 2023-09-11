package Exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class LacoExercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a
		 * tabuada de 1 a 10 do valor lido. */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("");
		int num = scan.nextInt();
		int aux = 0;
		int op = 0;
		// para o for
		
		
		for (int i = 0; i < 10; i++) {
			if (num < 1 || num > 10) {
				System.out.println("Valor Invalido");
			} else {
					aux = i + 1;
					op = num  * aux;
			}
			System.out.println(op);
		}
			
	}

}
