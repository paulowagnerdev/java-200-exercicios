package capitulo_02;

import java.util.Scanner;

public class Exercices04 {

	public static void main(String[] args) {

		/*
		 * Exercício 14: Conversão de Temperatura Crie um programa que converta uma
		 * temperatura em graus Celsius para Fahrenheit. A fórmula de conversão é: F =
		 * (C * 9/5) + 32. Exiba o resultado no console.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira a temperatuda em Celsius: ");
		double celcius = sc.nextInt();
		
		double f = (celcius * 9/5) + 32;
		
		System.out.println(f + "°F");
		
		sc.close();

	}

}
