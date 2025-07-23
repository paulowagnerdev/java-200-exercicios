package capitulo_01;

public class Exercices02 {

	public static void main(String[] args) {

		/*
		 * Exercício 2: Comentários no Código Escreva um programa Java que contenha três
		 * tipos de comentários: comentário de linha, comentário de bloco e comentário
		 * de documentação. Explique brevemente o uso de cada um desses comentários
		 * dentro do código.
		 */

		// Comentário de linha: usado para explicar uma linha específica de código
		System.out.println("Olá, mundo!");

		/*
		 * Comentário de bloco: pode ser usado para explicar uma parte maior do código,
		 * como um trecho com várias linhas. Também pode ser útil para desativar código
		 * temporariamente.
		 */
		int a = 2;
		int b = 4;
		int soma = a + b;
		System.out.println("Soma: " + soma);
	}

	/**
	 * Este método retorna uma saudação.
	 * 
	 * @return String com mensagem de saudação
	 */
	public static String saudacao() {
		return "Bem-vindo ao meu projeto 200 exercicios!";
	}

}
