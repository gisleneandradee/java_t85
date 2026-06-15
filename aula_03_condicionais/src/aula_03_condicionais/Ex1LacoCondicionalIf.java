package aula_03_condicionais;

import java.util.Scanner;

public class Ex1LacoCondicionalIf {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		int numeroA;
		int numeroB;
		int numeroC;
		
		System.out.println("Digite o número A: ");
		numeroA = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		numeroB = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		numeroC = leia.nextInt();
		
		if (numeroA + numeroB < numeroC) {
			System.out.println("A Soma de A + B é menor do que C");
		} else if (numeroA + numeroB > numeroC) {
			System.out.println("A Soma de A + B é maior do que C");
		} else {
			System.out.println("A Soma de A + B é igual a C");
		}
		
		leia.close();
		
	}

}
