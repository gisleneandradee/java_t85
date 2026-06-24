import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionStack {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("*****************************************************");
            System.out.println("\n    1 - Adicionar Cliente na Fila");
            System.out.println("    2 - Listar todos os Clientes");
            System.out.println("    3 - Retirar Cliente da Fila");
            System.out.println("    0 - Sair\n");
            System.out.println("*****************************************************");
            System.out.print("Entre com a opção desejada: ");
            
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do Cliente: ");
                    String nome = leia.nextLine();
                    filaBanco.add(nome);
                    System.out.println("\nCliente " + nome + " adicionado à fila com sucesso!\n");
                    break;

                case 2:
                    System.out.println("\nFila de Clientes Atual:");
                    if (filaBanco.isEmpty()) {
                        System.out.println("A fila está vazia.\n");
                    } else {
                        for (String cliente : filaBanco) {
                            System.out.println(cliente);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (filaBanco.isEmpty()) {
                        System.out.println("\nA Fila está vazia! Não há clientes para retirar.\n");
                    } else {
                        String clienteChamado = filaBanco.poll();
                        System.out.println("\nO Cliente " + clienteChamado + " foi chamado!\n");
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