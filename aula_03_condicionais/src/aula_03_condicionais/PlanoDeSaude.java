package aula_03_condicionais;

import java.util.Scanner;

public class PlanoDeSaude {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;

		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		System.out.printf("Nome: %s\n", nome);
		
		if (idade > 0 && idade <= 10) {
			System.out.println("Mensalidade do plano é de R$ 100,00;");
		} else if (idade >= 11 && idade <= 29) {
			System.out.println("Mensalidade do plano é de R$ 200,00");
		} else if (idade >= 30 && idade <= 45) {
			System.out.println("Mensalidade do plano é de R$ 300,00");
		} else if (idade >= 46 && idade <= 59) {
			System.out.println("Mensalidade do plano é de R$ 500,00");
		} else if (idade >= 60 && idade <= 65) {
			System.out.println("Mensalidade do plano é de R$ 600,00");
		} else {
			System.out.println("Mensalidade do plano é de R$ 1000,00");
		}
		
		
	}

}
