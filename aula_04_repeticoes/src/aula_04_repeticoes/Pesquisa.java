package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, esporte, totalRespostas = 0, somaIdades = 0, futebol = 0, voleibol = 0, basquete = 0, outros = 0;
		double mediaIdades = 0.0;
		char continua = 'S';
		
		while(continua == 'S') {
			System.out.println("***************************************");
			System.out.println("***Pesquisa sobre esportes favoritos***");
			System.out.println("***************************************");
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
				System.out.println("Escolha o seu esporte favorito: ");
				System.out.println("1 - Futebol");
				System.out.println("2 - Voleibol");
				System.out.println("3 - Basquetebol");
				System.out.println("4 - Outros");
			
				esporte = leia.nextInt();
			} while(esporte < 1 || esporte > 4);
			
			/*Estatísticas*/
			
			//Total de pessoas que responderam
			totalRespostas ++;
			
			//Soma total de todas as pessoas que responderam
			somaIdades += idade;
			
			if (idade >= 18 && esporte == 1)
				futebol ++;
			
			if (idade >= 18 && esporte == 2)
				voleibol ++;
				
			if (idade >= 18 && esporte == 3)
				basquete ++;
			
			if (idade >= 18 && esporte == 4)
				outros ++;
			
			do {
				System.out.println("Deseja continuar? (S/N)");
				continua = leia.next().toUpperCase().charAt(0);
			} while (!(continua == 'S') && !(continua == 'N'));
			
			System.out.println("***************************************");
		}
		
		mediaIdades = somaIdades / totalRespostas;
		
		System.out.printf("Total de pessoas que gostam de futebol: %d\n", futebol);
		System.out.printf("Total de pessoas que gostam de voleibol: %d\n", voleibol);
		System.out.printf("Total de pessoas que gostam de basquete: %d\n", basquete);
		System.out.printf("Total de pessoas que gostam de outros: %d\n", outros);
		System.out.printf("Média das idades: %.2f\n", mediaIdades);
		
		leia.close();
	}

}
