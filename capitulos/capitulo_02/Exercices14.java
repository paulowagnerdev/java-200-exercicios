package capitulo_02;

import java.util.Scanner;

public class Exercices14 {

	public static void main(String[] args) {

		/*
		 * Crie um programa que leia um ano e verifique se ele é bissexto. Um ano é
		 * bissexto se for divisível por 4, mas não por 100, exceto se for divisível por
		 * 400.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Informe o ano: ");
		int ano = sc.nextInt();
		
		if((ano%4==0&&ano%100!=0) || (ano % 400 == 0)) {
			System.out.println("O ano " + ano +  " é Bissexto");
		}
		
		sc.close();

	}

}
