package todolist;

import java.util.ArrayList;

public class ToDoList {
    // Lista de tarefas armazenadas
    private ArrayList<String> tarefas;

    public ToDoList() {
        // Inicializa a lista de tarefas
        tarefas = new ArrayList<>();
    }

    // Método para adicionar uma tarefa à lista
    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa);
    }

    // Método para remover uma tarefa pelo índice
    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            String tarefaRemovida = tarefas.remove(indice);
            System.out.println("Tarefa removida: " + tarefaRemovida);
        } else {
            System.out.println("Índice inválido. Não foi possível remover a tarefa.");
        }
    }

    // Método para exibir todas as tarefas
    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            System.out.println("Lista de tarefas:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }
}
