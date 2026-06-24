package aula_02_operadores;

import java.util.Scanner;

public class ExercicioOperadores4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        float n1, n2, n3, n4;
        float diferenca;

        System.out.print("numero1: ");
        n1 = leia.nextFloat();

        System.out.print("numero2: ");
        n2 = leia.nextFloat();

        System.out.print("numero3: ");
        n3 = leia.nextFloat();

        System.out.print("numero4: ");
        n4 = leia.nextFloat();

        diferenca = (n1 * n2) - (n3 * n4);

        System.out.printf("Diferença: %.1f%n", diferenca);

        leia.close();

	}

}
