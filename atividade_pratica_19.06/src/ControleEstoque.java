import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    String nome;
    int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}

public class ControleEstoque {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        List<Produto> estoque = new ArrayList<>();
        
        int opcao;

        do {
            System.out.println("\n--- SISTEMA DE CONTROLE DE ESTOQUE ---");
            System.out.println("1. Adicionar novo produto");
            System.out.println("2. Atualizar quantidade de um produto");
            System.out.println("3. Listar todos os produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeNovo = leia.nextLine();
                    
                    System.out.print("Digite a quantidade inicial em estoque: ");
                    int qtdInicial = leia.nextInt();

                    estoque.add(new Produto(nomeNovo, qtdInicial));
                    System.out.println("Produto adicionado ao estoque com sucesso!");
                    break;

                case 2:
                    if (estoque.isEmpty()) {
                        System.out.println("O estoque está vazio. Não há produtos para atualizar.");
                        break;
                    }

                    System.out.print("Digite o nome do produto que deseja atualizar: ");
                    String nomeBusca = leia.nextLine();
                    
                    boolean produtoEncontrado = false;

                    for (int i = 0; i < estoque.size(); i++) {
                        Produto p = estoque.get(i);
                        
                        if (p.nome.equalsIgnoreCase(nomeBusca)) {
                            System.out.print("Produto encontrado! Digite a nova quantidade: ");
                            int novaQtd = leia.nextInt();
                            
                            p.quantidade = novaQtd;
                            System.out.println("Quantidade atualizada com sucesso!");
                            produtoEncontrado = true;
                            break;
                        }
                    }

                    if (!produtoEncontrado) {
                        System.out.println("Produto não encontrado no estoque.");
                    }
                    break;

                case 3:
                    if (estoque.isEmpty()) {
                        System.out.println("O estoque está completamente vazio.");
                    } else {
                        System.out.println("\n--- ITENS EM ESTOQUE ---");
                        for (int i = 0; i < estoque.size(); i++) {
                            Produto p = estoque.get(i);
                            System.out.println("• Produto: " + p.nome + " | Qtd em Estoque: " + p.quantidade);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Fim do programa.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        leia.close();
    }
}