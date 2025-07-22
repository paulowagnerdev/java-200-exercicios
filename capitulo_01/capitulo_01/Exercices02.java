package capitulo_01;

public class Exercices02 {

	public static void main(String[] args) {

		// Comentário de linha: usado para explicar uma linha específica de código
		System.out.println("Olá, mundo!");

		/*
		 * Comentário de bloco: pode ser usado para explicar uma parte maior do código,
		 * como um trecho com várias linhas. Também pode ser útil para desativar código
		 * temporariamente.
		 */
		int a = 10;
		int b = 20;
		int soma = a + b;
		System.out.println("Soma: " + soma);
	}

	// OBS: SEM JAVADOC

	// Usado antes de classes, métodos ou atributos para gerar documentação
	// automática com ferramentas como o Javadoc.
	/**
	 * Este método retorna um olá mundo.
	 * 
	 * @return String com mensagem de saudação
	 */
	public static String saudacao() {
		return "Hello World!";
	}

}
