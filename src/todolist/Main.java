package todolist; // Certifique-se de que está no mesmo pacote da classe ToDoList

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma instância da lista de tarefas
        ToDoList listaTarefas = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibir o menu de opções
            System.out.println("\nLista de Tarefas:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Exibir tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            // Processar a opção escolhida
            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String tarefa = scanner.nextLine();
                    listaTarefas.adicionarTarefa(tarefa);
                    break;
                case 2:
                    System.out.print("Digite o número da tarefa a ser removida: ");
                    int indice = scanner.nextInt();
                    listaTarefas.removerTarefa(indice - 1); // Subtrai 1 para ajustar ao índice 0
                    break;
                case 3:
                    listaTarefas.exibirTarefas();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
