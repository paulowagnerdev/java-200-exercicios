package capitulo_02;

import java.util.Scanner;

public class Exercices09 {

	public static void main(String[] args) {

		/*
		 * Exercício 19: Elegibilidade para Votação Crie um programa que leia a idade de
		 * uma pessoa e verifique se ela é elegível para votar (idade igual ou superior
		 * a 18 anos).
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira a idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("Idade apta a votar!");
		}else {
			System.out.println("Idade NÃO apta a votar!");
		}
		
		sc.close();
	}

}
