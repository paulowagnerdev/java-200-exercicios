package capitulo_02;

import java.util.Scanner;

public class Exercices03 {

	public static void main(String[] args) {

		/*
		 * Exercício 13: Área de um Retângulo Desenvolva um programa que leia a largura
		 * e a altura de um retângulo e calcule a área. Exiba o resultado no console.
		 * Dica: area = largura x altura.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insira a altura: ");
		double height = sc.nextDouble();
		System.out.printf("Insira a largura: ");
		double width = sc.nextDouble();
		
		double area = height*width;
		
		System.out.println("Area = " + area);
		
		sc.close();
	}

}
