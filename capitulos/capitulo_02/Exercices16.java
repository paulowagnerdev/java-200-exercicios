package capitulo_02;

import java.util.Scanner;

public class Exercices16 {

	public static void main(String[] args) {

		/*
		 * Exercício 26: Atribuição Simples Enunciado:  Crie um programa que declare uma
		 * variável inteira, atribua um valor a ela e, em seguida, modifique o valor
		 * utilizando os operadores de atribuição (+=, -=, *=, /=, %=). Exiba o
		 * resultado após cada operação.
		 */
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		System.out.println("Usando += " + (numero += 2));
		System.out.println("Usando -= " + (numero -= 2));
		System.out.println("Usando *= " + (numero *= 2));
		System.out.println("Usando /= " + (numero /= 2));
		System.out.println("Usando %= " + (numero %= 2));
		
		sc.close();
	}

}
