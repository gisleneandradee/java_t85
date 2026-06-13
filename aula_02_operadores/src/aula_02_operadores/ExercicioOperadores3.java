package aula_02_operadores;

import java.util.Scanner;

public class ExercicioOperadores3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        float salarioBruto;
        float adicionalNoturno;
        float horasExtras;
        float descontos;
        float salarioLiquido;

        System.out.print("Salário Bruto: ");
        salarioBruto = leia.nextFloat();

        System.out.print("Adicional Noturno: ");
        adicionalNoturno = leia.nextFloat();

        System.out.print("Horas Extras: ");
        horasExtras = leia.nextFloat();

        System.out.print("Descontos: ");
        descontos = leia.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.printf("Salário Líquido: %.2f%n", salarioLiquido);

        leia.close();

	}

}
