import java.util.Scanner;

public class AnaliseDeIdadeEAcesso {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		String nome;
		int idade;
		boolean autorizacao = false;
		
		System.out.println("Seja bem-vindo(a)");
		System.out.println("*****************");
		
		System.out.println("Qual é o seu nome?");
		nome = leia.nextLine();
		
		System.out.println(nome + ", quantos anos você tem?");
		idade = leia.nextInt();
		leia.nextLine();
		
		if (idade >= 18) {
			System.out.println("Acesso liberado para " + nome + ".");
			
		} else {
			System.out.println("Você tem autorização, " + nome + "? (Sim/Não)");
			String respostaTexto = leia.nextLine();
			
			if (respostaTexto.equalsIgnoreCase("Sim")) {
				autorizacao = true;
			}
			
			if (autorizacao) {
				System.out.println("Acesso liberado com autorização para " + nome + ".");
			} else {
				System.out.println("Acesso negado para " + nome + ".");
			}
		} 
		
		leia.close();

	}

}
