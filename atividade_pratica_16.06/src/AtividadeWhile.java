import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int menores21 = 0, maiores50 = 0;
		
		System.out.println("Digite uma idade: ");
		int idade = leia.nextInt();
		
		while (idade >= 0) {
			if (idade < 21) {
				menores21++;
			} else if (idade > 50) {
				maiores50++;
			}
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
		
		leia.close();
	}

}
