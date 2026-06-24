import java.util.Scanner;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int somaPositivos = 0, numero;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				somaPositivos += numero;
			}
		} while (numero != 0);
		
		System.out.println("A soma dos numeros positivos é " + somaPositivos);
		
		leia.close();
	}

}
