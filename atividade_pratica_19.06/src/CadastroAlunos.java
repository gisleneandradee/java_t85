import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {
    String nome;
    int idade;
    double notaFinal;

    public Aluno(String nome, int idade, double notaFinal) {
        this.nome = nome;
        this.idade = idade;
        this.notaFinal = notaFinal;
    }
}

public class CadastroAlunos {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        List<Aluno> listaAlunos = new ArrayList<>();
        
        int opcao;
        
        do {
            System.out.println("\n--- SISTEMA DE CADASTRO DE ALUNOS ---");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Listar alunos cadastrados");
            System.out.println("3. Calcular média geral das notas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = leia.nextLine();
                    
                    System.out.print("Digite a idade do aluno: ");
                    int idade = leia.nextInt();
                    
                    System.out.print("Digite a nota final do aluno: ");
                    double nota = leia.nextDouble();

                    Aluno novoAluno = new Aluno(nome, idade, nota);
                    listaAlunos.add(novoAluno);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;

                case 2:
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado no momento.");
                    } else {
                        System.out.println("\n--- LISTA DE ALUNOS ---");
                        for (int i = 0; i < listaAlunos.size(); i++) {
                            Aluno alunoAtual = listaAlunos.get(i);
                            System.out.println("Nome: " + alunoAtual.nome + 
                                               " | Idade: " + alunoAtual.idade + 
                                               " anos | Nota Final: " + alunoAtual.notaFinal);
                        }
                    }
                    break;

                case 3:
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Não há notas cadastradas para calcular a média.");
                    } else {
                        double somaNotas = 0;
                        
                        for (Aluno aluno : listaAlunos) {
                            somaNotas += aluno.notaFinal;
                        }
                        
                        double mediaGeral = somaNotas / listaAlunos.size();
                        System.out.printf("A média geral das notas é: %.2f\n", mediaGeral);
                    }
                    break;

                case 0:
                    System.out.println("Fim do programa");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        leia.close();
    }
}