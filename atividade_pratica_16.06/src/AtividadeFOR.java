import java.util.Scanner;

public class AtividadeFOR {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int totalPares = 0, totalImpares = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + " numero: ");
			int numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				totalPares ++;
			} else {
				totalImpares++;
			}
		}
		
		System.out.println("\nTotal de números pare: " + totalPares);
		
		System.out.println("Total de números impares: " + totalImpares);
		
		leia.close();
	}

}
