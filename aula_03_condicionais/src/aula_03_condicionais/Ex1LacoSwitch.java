package aula_03_condicionais;

import java.util.Scanner;

public class Ex1LacoSwitch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigo, quantidade;
		String produto = "";
		double precoUnitario = 0.0;
		double valorTotal;
		
		System.out.print("Código do Produto: ");
		codigo = leia.nextInt();
		
		System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		
		switch (codigo) {
			case 1:
				produto = "Cachorro Quente";
				precoUnitario = 10.00;
				break;
			case 2:
				produto = "X-Salada";
				precoUnitario = 15.00;
				break;
			case 3:
				produto = "X-Bacon";
				precoUnitario = 18.00;
				break;
			case 4:
				produto = "Bauru";
				precoUnitario = 12.00;
				break;
			case 5:
				produto = "Refrigerante";
				precoUnitario = 8.00;
				break;
			case 6:
				produto = "Suco de laranja";
				precoUnitario = 13.00;
				break;
			default:
				System.out.println("Código inválido!");
				leia.close();
				return;
		}
		
		valorTotal = quantidade * precoUnitario;
		
		System.out.println("\nProduto: " + produto);
		
		System.out.printf("Valor total: R$ %.2f\n", valorTotal);
		
		leia.close();

	}

}
