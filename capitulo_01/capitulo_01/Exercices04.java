package capitulo_01;

public class Exercices04 {
	public static void main(String args[]) {
		/*
		 * Exercício 4: Conversão de Tipos, Escreva um programa que converta um valor
		 * double em int e outro valor int em double. Exiba os resultados das conversões
		 * e explique a diferença entre conversão explícita e implícita. Dica: procure
		 * por type casting em Java.
		 */
		
		int number = 10;
		double doubleValue = 50.150;
		
		int intValue = (int) doubleValue; // Conversão explícita de double para int 
		double d = number; // Conversão implícita de int para double 
		
		System.out.println("Número converteu double em int " + intValue);
		System.out.println("Número converteu inteiro em double " + d);
		
		
		
	}
}
