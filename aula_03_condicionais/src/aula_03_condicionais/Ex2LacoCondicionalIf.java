package aula_03_condicionais;

import java.util.Scanner;

public class Ex2LacoCondicionalIf {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o Nome do doador:");
		nome = leia.nextLine();
		
		System.out.println("Digite a Idade do doador:");
		idade = leia.nextInt();
		leia.nextLine(); 
		
		System.out.println("É a sua primeira doação de sangue? (sim/não)");
		String respostaTexto = leia.nextLine();
		
		primeiraDoacao = respostaTexto.equalsIgnoreCase("sim");

		if (idade < 18 || idade > 69) {
			System.out.println(nome + " não está apto para doar sangue!");
		} else if (idade >= 60 && idade <= 69 && primeiraDoacao) {
			System.out.println(nome + " não está apto para doar sangue!");
		} else {
			System.out.println(nome + " está apto para doar sangue!");
		}
		
		leia.close();
	}

}
