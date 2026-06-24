package aula_02_operadores;

import java.util.Scanner;

public class ExercicioOperadores1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        float salario;
        float abono;
        float novoSalario;

        System.out.print("Digite o Salário: ");
        salario = leia.nextFloat();

        System.out.print("Digite o Abono: ");
        abono = leia.nextFloat();

        novoSalario = salario + abono;

        System.out.printf("Novo Salário: %.2f%n", novoSalario);

        leia.close();
        
	}

}
