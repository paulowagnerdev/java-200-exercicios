package capitulo_02;

import java.util.Scanner;

public class Exercices02 {

	public static void main(String[] args) {

		/*
		 * Exercício 12: Média Aritmética Escreva um programa que leia três números
		 * inteiros do usuário e calcule a média aritmética deles. Exiba o resultado no
		 * console.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.printf("Insira o segundo número: ");
		int num2 = sc.nextInt();
		System.out.printf("Insira o terceiro número: ");
		int num3 = sc.nextInt();
		
		double media = (num1+num2+num3) / 3;
		
		System.out.println("Media: " + media);
		
		sc.close();
	}

}
