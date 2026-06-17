package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Vetor inicializado com dados
		int vetorInteiro[] = {10, 20, 70, 45, 78, 100, 35, 70};
		
		//Vetor vazio
		float vetorReal [] = new float[5];
		
		//Listar todos os dados do vetor de inteiros
		for (int contador = 0; contador < vetorInteiro.length; contador ++) {
			System.out.printf("vetorInteiro[%d] = %d\n", contador, vetorInteiro[contador]);
		}
		
		System.out.println("Tamanho do Vetor de inteiros: " + vetorInteiro.length);
		
		//Inserir dados no vetor de reais
		for (int contador = 0; contador < vetorReal.length; contador ++) {
			System.out.printf("Digite um valor real para a posição [%d]\n", contador);
			vetorReal [contador] = leia.nextFloat();
		}
		
		
		//Ordena o vetor em ordem crescente (muda a ordem no vetor)
		Arrays.sort(vetorReal);
		
		//Listar todos os dados do vetor de reais em ordem decrescente (Não muda a ordem no vetor)
				for (int contador = vetorReal.length -1; contador >= 0; contador --) {
					System.out.printf("vetorReal[%d] = %.2f\n", contador, vetorReal[contador]);
				}
		
		System.out.println("Tamanho do Vetor de reais: " + vetorReal.length);
		
		System.out.println("Qual é o indice do valor 10 no vetor de reais?" + Arrays.binarySearch(vetorReais, 10));
		
		leia.close();
	}

}
