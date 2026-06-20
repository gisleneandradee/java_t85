import java.util.Scanner;
import java.util.Stack;

public class SistemaPilhaLivros {

    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner leia = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("*****************************************************");
            System.out.println("\n    1 - Adicionar Livro na pilha");
            System.out.println("    2 - Listar todos os Livros");
            System.out.println("    3 - Retirar Livro da pilha");
            System.out.println("    0 - Sair\n");
            System.out.println("*****************************************************");
            System.out.print("Entre com a opção desejada: ");
            
            String entrada = leia.nextLine();
            
            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do livro: ");
                    String nomeLivro = leia.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("\nLivro \"" + nomeLivro + "\" adicionado à pilha!\n");
                    break;

                case 2:
                    System.out.println("\nLivros na Pilha (na ordem que foram adicionados):");
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia.\n");
                    } else {
                        for (int i = 0; i < pilhaLivros.size(); i++) {
                            System.out.println(pilhaLivros.get(i));
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("\nA Pilha está vazia! Não há livros para retirar.\n");
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("\nO Livro \"" + livroRetirado + "\" foi retirado da pilha!");
                        
                        System.out.println("\nLivros restantes na pilha:");
                        if (pilhaLivros.isEmpty()) {
                            System.out.println("Nenhum livro restou. A pilha agora está vazia.\n");
                        } else {
                            for (int i = 0; i < pilhaLivros.size(); i++) {
                                System.out.println(pilhaLivros.get(i));
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma finalizado. Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.\n");
                    break;
            }

        } while (opcao != 0);

        leia.close();
    }
}