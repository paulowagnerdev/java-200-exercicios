package capitulo_01;

public class Exercices03 {

	/*
	 * Exercício 3: Variáveis e Tipos de Dados
	 * 
	 * Crie um programa que declare e inicialize variáveis de todos os tipos
	 * primitivos em Java (int, double, char, boolean, etc.). Exiba o valor de cada
	 * variável no console.      
	 */

	public static void main(String[] args) {

		int idade = 10;
		double height = 1.55;
		char sex = 'M';
		String name = "Larissa";
		double currence = 55.16875646;
		boolean isActive = false;

		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + height);
		System.out.println("Sexo: " + sex);
		System.out.println("Nome: " + name);
		System.out.println("Usuário está ativo: " + isActive);
		System.out.printf("%.4f%n", currence);

	}

}
