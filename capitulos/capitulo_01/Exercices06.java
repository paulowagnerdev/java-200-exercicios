package capitulo_01;

import java.util.Locale;


public class Exercices06 {

	public static void main(String[] args) {
		/*
		 * Exercício 6: Constantes Crie um programa que utilize a palavra-chave final
		 * para declarar uma constante que representa a velocidade da luz no vácuo.
		 * Tente alterar o valor da constante e observe o comportamento do compilador.
		 */

		Locale.setDefault(Locale.US);
		final double EULER_NUMBER = 2.71828;

		System.out.println("Número de Euler: " + EULER_NUMBER);

	}

}
