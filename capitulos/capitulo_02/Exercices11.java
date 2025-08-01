package capitulo_02;

import java.util.Scanner;

public class Exercices11 {

	public static void main(String[] args) {

		/*
		 * Exercício 21: Comparação de Strings Desenvolva um programa que leia duas
		 * strings do usuário e verifique se elas são iguais. Exiba uma mensagem
		 * informando o resultado da comparação.;
		 */

		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira a primeira String: ");
		String primeira = sc.nextLine();
		System.out.printf("Insira a segunda String: ");
		String segunda = sc.nextLine();
		
		if(primeira.equals(segunda)) {
			System.out.println("É igual!");
		}else {
			System.out.println("Não é igual!");
		}
		
		sc.close();
	}

}
