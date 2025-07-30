package capitulo_02;

import java.util.Scanner;

public class Exercices06 {

	public static void main(String[] args) {

		/*
		 * } Exercício 16: Comparação Simples Crie um programa que leia dois
		 * números inteiros e exiba se o primeiro é maior, menor ou igual ao segundo.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.printf("Insira o segundo número: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro número é maior!");
		}else if(num1 == num2) {
			System.out.println("Os números são iguais!");
		}else {
			System.out.println("O segundo número é maior!");
		}
		
		sc.close();
	}

}
