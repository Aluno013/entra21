package Exercicios;

public class LacoExercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Descreva um algoritmo que calcule e escreva a soma dos números 
		pares e a soma dos números ímpares entre 1 e 1000 */
		
		int par = 0;
		int impar = 0;
		
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				par += i; // realiza soma dos numeors pares
			// ou par = par + i;
			} else {
				impar += i; // realiza soma dos numeors impares
			// ou impar = impar + i;
			}
		}
		System.out.println("A soma dos numeros impares é " + impar);
		System.out.println("A soma dos numeros pares é " + par);
		
	}

}