package capitulo_02;

import java.util.Scanner;

public class Exercices12 {

	public static void main(String[] args) {

		/*
		 * Exercício 22: Operadores Lógicos AND e OR Crie um programa que leia três
		 * números inteiros e verifique se pelo menos um deles é maior que 10 (usando o
		 * operador ||). Em seguida, verifique se todos são maiores que 10 (usando o
		 * operador &&).
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.printf("Insira o segundo número: ");
		int num2 = sc.nextInt();
		System.out.printf("Insira o terceiro número: ");
		int num3 = sc.nextInt();
		
		if(num1 > 10 || num2 > 10 || num3 > 10 ) {
			System.out.println("Um dos números é maior que 10!");
		}else {
			System.out.println("Nenhum é maior que 10");
		}

		if(num1 > 10 && num2 > 10 && num3 > 10 ) {
			System.out.println("Todos os números são maiores que 10!");
		}
		
		sc.close();

	}

}
