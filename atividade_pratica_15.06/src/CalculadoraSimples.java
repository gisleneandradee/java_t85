import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
				
		double numero1, numero2;
		int operacao;
		double resultado = 0.0;
		String nomeOperacao = "";
		boolean operacaoValida = true;

		System.out.println("---CALCULADORA---");
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.println("===Escolha a operação===");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		operacao = leia.nextInt();
		leia.nextLine();
		
		System.out.println("\n===Resultado===");
		
		if (operacao == 1) {
			nomeOperacao = "Soma";
			resultado = numero1 + numero2;
		} 
		else if (operacao == 2) {
			nomeOperacao = "Subtração";
			resultado = numero1 - numero2;
		} 
		else if (operacao == 3) {
			nomeOperacao = "Multiplicação";
			resultado = numero1 * numero2;
		} 
		else if (operacao == 4) {
			nomeOperacao = "Divisão";
			
			if (numero2 != 0) {
				resultado = numero1 / numero2;
			} else {
				System.out.println("Erro: Não é possível dividir por zero!");
				operacaoValida = false;
			}
		} 
		else {
			System.out.println("Erro: Código de operação inválido.");
			operacaoValida = false;
		}

		if (operacaoValida) {
			System.out.printf("Operação: %s | Resultado: %.2f\n", nomeOperacao, resultado);
		}
				
				leia.close();
			}

	}
