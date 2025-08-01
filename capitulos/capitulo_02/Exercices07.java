package capitulo_02;

import java.util.Scanner;

public class Exercices07 {

	public static void main(String[] args) {

		/*
		 * Exercício 17: Verificação de Paridade Escreva um programa que leia um número
		 * inteiro e exiba se ele é par ou ímpar.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira um número: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("É UM NÚMERO PAR!");
		}else {
			System.out.println("NÃO É PAR!");
		}
		
		sc.close();
	}

}
