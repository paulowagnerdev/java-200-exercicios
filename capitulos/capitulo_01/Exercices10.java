package capitulo_01;

import java.util.Locale;

public class Exercices10 {

	public static void main(String[] args) {

		/*
		 * Exercício 10: Formatação de Saída Desenvolva um programa que exiba o valor de
		 * uma variável double com duas casas decimais. Utilize formatação para garantir
		 * que o valor seja exibido corretamente.
		 * 
		 */
		Locale.setDefault(Locale.US);
		double pi = 3.14159;
		
		System.out.printf("Pi formatado %.2f%n", pi);

	}
}
