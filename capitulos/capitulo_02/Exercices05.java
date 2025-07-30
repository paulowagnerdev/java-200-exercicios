package capitulo_02;

import java.util.Scanner;

public class Exercices05 {

	public static void main(String[] args) {

		/*
		 * Escreva um programa que leia dois números inteiros do usuário e exiba o
		 * resultado da potenciação do primeiro número elevado ao segundo número (use o
		 * método Math.pow).
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.printf("Insira o segundo número: ");
		int num2 = sc.nextInt();
		System.out.println();
		System.out.printf("%.0f",Math.pow(num1, num2));
		
		sc.close();
	}

}
