import java.util.Scanner;

public class AtividadeMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        
        int totalAlunos = 10;
        int totalBimestres = 4;
        
        double[][] matrizNotas = new double[totalAlunos][totalBimestres];
        double[] vetorMedias = new double[totalAlunos];
        
        System.out.println("*****Entrada de Notas*****");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("Digite as " + totalBimestres + " notas do participante " + (i + 1) + ":");
            for (int j = 0; j < totalBimestres; j++) {
                matrizNotas[i][j] = leia.nextDouble();
            }
        }
        
        for (int i = 0; i < totalAlunos; i++) {
            double somaNotas = 0.0;
            for (int j = 0; j < totalBimestres; j++) {
                somaNotas += matrizNotas[i][j];
            }
            vetorMedias[i] = somaNotas / totalBimestres;
        }
       
        System.out.println("\n--- Vetor de Médias ---");
        System.out.print("[ ");
        for (int i = 0; i < totalAlunos; i++) {

            String mediaFormatada = String.format("%.1f", vetorMedias[i]).replace(',', '.');
            System.out.print(mediaFormatada + " ");
        }
        System.out.println("]");
        
        leia.close();
	}

}
