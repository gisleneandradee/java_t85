import java.util.Scanner;

public class AtividadeVetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("Digite o número que deseja encontrar: ");
		int numeroProcurado = leia.nextInt();
		
		int posicaoEncontrada = -1;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroProcurado) {
				posicaoEncontrada = i;
				break;
			}
		}
		
		if (posicaoEncontrada != -1) {
			System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicaoEncontrada);
		} else {
			System.out.println("O numero " + numeroProcurado + " não foi encontrado");
		}
		
		leia.close();
	}

}
