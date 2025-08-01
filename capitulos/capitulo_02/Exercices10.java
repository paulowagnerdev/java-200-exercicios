package capitulo_02;

import java.util.Scanner;

public class Exercices10 {

	public static void main(String[] args) {

		/*
		 * Exercício 20: Verificação de Intervalo Escreva um programa que leia um número
		 * inteiro e verifique se ele está entre 10 e 20 (inclusive). Exiba uma mensagem
		 * informando se o número está dentro ou fora do intervalo.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira um número inteiro: ");
		int num = sc.nextInt();
		
		if(num>=10&&num<=20) {
			System.out.println("Está entre 10 e 20");
		}else {
			System.out.println("Não está entre 10 e 20");
		}
		
		sc.close();

	}

}
