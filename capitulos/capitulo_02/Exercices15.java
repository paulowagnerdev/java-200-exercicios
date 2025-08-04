package capitulo_02;

import java.util.Scanner;

public class Exercices15 {

	public static void main(String[] args) {

		/*
		 *Exercício 25: Verificação de Números Positivos Escreva um programa que leia três números
		 * inteiros e verifique se pelo menos dois deles são positivos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insira o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.printf("Insira o segundo número: ");
		int num2 = sc.nextInt();
		System.out.printf("Insira o terceiro número: ");
		int num3 = sc.nextInt();
		
		int positivo = 0;
		
		if(num1 > 0) {
			positivo++;
		}
		
		if(num2 > 0) {
			positivo++;
		}
		
		if(num3 > 0) {
			positivo++;
		}
		
		if(positivo > 1) {
			System.out.println("Tem dois números maiores");
		}
		
		sc.close();
		

	}

}
