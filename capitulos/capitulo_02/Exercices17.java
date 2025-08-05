package capitulo_02;

import java.util.Scanner;

public class Exercices17 {

	public static void main(String[] args) {

		/*
		 * Exercício 27: Incremento e Decremento Enunciado:
		 * Escreva um programa que declare uma variável inteira, aplique o operador de
		 * incremento (++) e decremento (--), e exiba o valor da variável antes e depois
		 * de cada operação.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira o primeiro número: ");
		int num1 = sc.nextInt();
	
		int incrementa = num1;
		int decrementa = num1;
		
		for(int i=0;i<num1;i++) {
			System.out.println("Número incrementando: " + incrementa++);
		}
		
		System.out.println();
		
		for(int i=0;i<=num1;i++) {
			System.out.println("Número decrementando: " + decrementa--);
		}
		
		sc.close();
	}

}
