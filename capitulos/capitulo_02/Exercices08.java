package capitulo_02;

import java.util.Scanner;

public class Exercices08 {

	public static void main(String[] args) {

		// Exercício 18: Maior de Três Números Desenvolva um programa que leia três
		// números inteiros e exiba o maior deles.

		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.printf("Insira o segundo número: ");
		int num2 = sc.nextInt();
		System.out.printf("Insira o terceiro número: ");
		int num3 = sc.nextInt();

		int maior = num1;

		if (num2 > maior) {
			maior = num2;
		} 
		
		if (num3 > maior) {
			maior = num3;
		} 

		System.out.println("O número maior é " + maior);
		sc.close();
	}

}
