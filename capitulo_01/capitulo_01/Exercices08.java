package capitulo_01;

import java.util.Scanner;

public class Exercices08 {

	public static void main(String[] args) {

		/*
		 * Crie um programa que peça ao usuário para digitar seu nome e sobrenome. O
		 * programa deve exibir uma mensagem de boas-vindas concatenando o nome e o
		 * sobrenome do usuário.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter your first name: ");
		String name = sc.nextLine();
		System.out.printf("Enter your last name: ");
		String lastName = sc.nextLine();
		System.out.println();
		System.out.println("Welcome! " + name + " " + lastName + "! :)");
		sc.close();
	}

}
