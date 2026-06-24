package aula_08_poo;

import java.util.Scanner;

public class TestaCurso {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		CursoEad curso1 = new CursoEad("Física", 100, 20, "Marcelo", 2);
		CursoEad curso2 = new CursoEad("Física", 100, 20, "Marcelo", 2);
		
		curso1.visualizar();
		curso2.visualizar();
		
		CursoEad novoCurso = new CursoEad();

		System.out.println("Criação de curso");

		System.out.println("Digite o nome do curso:");
		novoCurso.setNomeCurso(leia.nextLine());

		System.out.println("Digite o nome do professor:");
		novoCurso.setNomeProfessor(leia.nextLine());

		System.out.println("Digite o valor da mensalidade:");
		novoCurso.setMensalidade(leia.nextFloat());
		leia.nextLine(); // limpa o Enter pendente

		System.out.println("Digite a quantidade de módulos:");
		novoCurso.setModulos(leia.nextInt());
		leia.nextLine(); // limpa o Enter pendente

		System.out.println("Digite a quantidade total de horas:");
		novoCurso.setTotalHoras(leia.nextInt());
		leia.nextLine(); // limpa o Enter pendente

		novoCurso.visualizar();

		System.out.printf("\nMensalidade do curso: %.2f", novoCurso.getMensalidade());
		
	}

}