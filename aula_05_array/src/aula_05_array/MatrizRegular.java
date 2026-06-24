package aula_05_array;

public class MatrizRegular {

	public static void main(String[] args) {
		
		int matrizInteiros[][] = {
									{10, 15, 20},
									{5, 55, 60},
									{75, 80, 85}
		};
		
		double matrizDouble[][] = new double[2][3];
		
		for (int linha = 0; linha < matrizInteiros.length; linha ++) {
			for (int coluna = 0; coluna < matrizInteiros[linha].length; coluna ++) {
				System.out.printf("matrizInteiros[%d][%d] = %d\n", linha, coluna, matrizInteiros[linha][coluna]);
			}
		}

	}

}
