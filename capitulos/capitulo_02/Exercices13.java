package capitulo_02;

import java.util.Scanner;

public class Exercices13 {

	public static void main(String[] args) {

		/*
		 * Exercício 23: Verificação de Maioria Escreva um programa que leia a idade de
		 * três pessoas e verifique se pelo menos duas delas são maiores de idade (18
		 * anos ou mais).
		 */

		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira a primeira idade: ");
		int idade1 = sc.nextInt();
		System.out.printf("Insira a segunda idade: ");
		int idade2 = sc.nextInt();
		System.out.printf("Insira a terceira idade: ");
		int idade3 = sc.nextInt();

		int count = 0;

		if (idade1 >= 18 || idade2 >= 18 || idade3 >= 18) {
			if (idade1 >= 18) {
				count += 1;
			}
			if (idade2 >= 18) {
				count += 1;
			}
			if (idade3 >= 18) {
				count += 1;
			}
			
			if(count > 1) {
				System.out.println("Pelo menos duas delas são maiores de idade!");
			}else {
				System.out.println("Apenas uma é maior de idade!");
			}
		} else {
			System.out.println("Nenhuma é maior que 18!");
		}
		
		sc.close();
	}

}
