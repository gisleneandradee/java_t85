package aula_02_operadores;

import java.util.Scanner;

public class ExerciciosOperadores2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        float nota1, nota2, nota3, nota4;
        float mediaFinal;

        System.out.print("Nota 1: ");
        nota1 = leia.nextFloat();

        System.out.print("Nota 2: ");
        nota2 = leia.nextFloat();

        System.out.print("Nota 3: ");
        nota3 = leia.nextFloat();

        System.out.print("Nota 4: ");
        nota4 = leia.nextFloat();

        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Média final: %.1f%n", mediaFinal);

        leia.close();

	}

}
