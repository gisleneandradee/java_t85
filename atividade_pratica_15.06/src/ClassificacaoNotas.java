import java.util.Scanner;

public class ClassificacaoNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String nome;
		double nota1, nota2, nota3, nota4;
		double media;
		String situacao = "";
		
		System.out.println("Nome do aluno: ");
		nome = leia.nextLine();
		
		System.out.println("Qual é a primeira nota de " + nome + "?");
		nota1 = leia.nextDouble();
		
		System.out.println("Qual é a segunda nota de " + nome + "?");
		nota2 = leia.nextDouble();
		
		System.out.println("Qual é a terceira nota de " + nome + "?");
		nota3 = leia.nextDouble();
		
		System.out.println("Qual é a quarta nota de " + nome + "?");
		nota4 = leia.nextDouble();
		leia.nextLine();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4.0;
		
		if (media >= 7) {
			situacao = "Aprovado";
		} else if (media >= 5 && media < 7) {
			situacao = "Recuperação";
		} else {
			situacao = "Reprovado";
		}
		
		System.out.println("\n---Resultado final---");
		System.out.printf("Aluno: %s | Média Final: %.2f | Situação: %s\n", nome, media, situacao);
		
		leia.close();

	}

}
