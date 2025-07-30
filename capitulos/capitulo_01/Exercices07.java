package capitulo_01;

import java.util.Locale;
import java.util.Scanner;

public class Exercices07 {

	public static void main(String[] args) {
		/*
		 * Exercício 7: Entrada de Dados Escreva um programa que leia um número inteiro
		 * e um número decimal do teclado e, em seguida, exiba a soma desses números no
		 * console.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter the integer number: ");
		int a = sc.nextInt();
		System.out.printf("Enter the decimal number: ");
		double b = sc.nextDouble();

		System.out.printf("Result: %.2f%n", a + b);

		sc.close();

	}

}
