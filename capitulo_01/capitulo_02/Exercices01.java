package capitulo_02;

import java.util.Scanner;

public class Exercices01 {

	public static void main(String[] args) {

		/*
		 * Crie um programa que leia dois números inteiros do usuário e exiba a soma,
		 * subtração, multiplicação, divisão e o módulo desses números no console.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.printf("Insira o segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("SOMA = " + (num1 + num2));
		System.out.println("SUBTRAÇÃO = " + (num1 - num2));
		System.out.println("MULTIPLICAÇÃO = " + (num1 * num2));
		System.out.println("DIVISÃO = " + (num1 / num2));
		System.out.println("MÓDULO = " + (num1 % num2));

	}

}
