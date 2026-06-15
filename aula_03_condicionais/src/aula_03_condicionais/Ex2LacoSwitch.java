package aula_03_condicionais;

import java.util.Scanner;

public class Ex2LacoSwitch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codigoCargo;
		float salario;
		String cargo = "";
		float percentualReajuste = 0.0f;
		float novoSalario;
		
		System.out.print("Nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.print("Cargo: ");
		codigoCargo = leia.nextInt();
		
		System.out.print("Salário: R$ ");
		salario = leia.nextFloat();
		
		switch (codigoCargo) {
			case 1:
				cargo = "Gerente";
				percentualReajuste = 0.10f;
				break;
			case 2:
				cargo = "Vendedor";
				percentualReajuste = 0.07f;
				break;
			case 3:
				cargo = "Supervisor";
				percentualReajuste = 0.09f;
				break;
			case 4:
				cargo = "Motorista";
				percentualReajuste = 0.06f;
				break;
			case 5:
				cargo = "Estoquista";
				percentualReajuste = 0.05f;
				break;
			case 6:
				cargo = "Técnico de TI";
				percentualReajuste = 0.08f;
				break;
			default:
				System.out.println("Código de cargo inválido!");
				leia.close();
				return;
		}
		
		novoSalario = salario + (percentualReajuste * salario);
		
		System.out.println("\nNome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salário: R$ %.2f\n", novoSalario);
		
		leia.close();

	}

}
