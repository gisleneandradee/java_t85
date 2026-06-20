import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnaliseNumerica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        
        int[] numeros = new int[5];

        System.out.println("--- Entrada de Dados ---");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = leia.nextInt();
        }

        leia.close();

        Map<String, Double> resultado = analisarColecao(numeros);

        System.out.println("\n--- Análise dos Dados ---");
        System.out.println("• A soma de todos os números: " + resultado.get("soma").intValue());
        System.out.println("• A média dos valores: " + resultado.get("media"));
        System.out.println("• O maior número da coleção: " + resultado.get("maior").intValue());
    }

    public static Map<String, Double> analisarColecao(int[] colecao) {
        int soma = 0;
        int maiorNumero = colecao[0];

        for (int i = 0; i < colecao.length; i++) {
            int numeroAtual = colecao[i];

            soma += numeroAtual;

            if (numeroAtual > maiorNumero) {
                maiorNumero = numeroAtual;
            }
        }

        double media = (double) soma / colecao.length;

        Map<String, Double> resultados = new HashMap<>();
        resultados.put("soma", (double) soma);
        resultados.put("media", media);
        resultados.put("maior", (double) maiorNumero);

        return resultados;

	}

}
