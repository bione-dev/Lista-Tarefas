### Explicação do Código

O código implementa uma lista de tarefas simples em Java, permitindo que o usuário adicione, remova e visualize tarefas. A aplicação é dividida em duas classes: `Main` e `ToDoList`. Aqui está uma descrição detalhada de cada parte do código:

1. **Classe `Main`**:
   - **Pacote**: A classe está no pacote `todolist`, garantindo que esteja organizada.
   - **Método `main`**:
     ```java
     public static void main(String[] args) {
     ```
     O ponto de entrada da aplicação é o método `main`, onde a execução do programa começa.

   - **Criação da Lista de Tarefas**:
     ```java
     ToDoList listaTarefas = new ToDoList();
     ```
     Uma instância da classe `ToDoList` é criada para gerenciar as tarefas.

   - **Scanner para Entrada do Usuário**:
     ```java
     Scanner scanner = new Scanner(System.in);
     ```
     Um objeto `Scanner` é criado para ler a entrada do usuário.

   - **Menu de Opções**:
     ```java
     do {
         // Exibir o menu de opções
     }
     while (opcao != 4);
     ```
     Um loop é utilizado para exibir um menu de opções até que o usuário escolha sair.

   - **Processamento das Opções**:
     O usuário pode escolher entre quatro opções:
     - Adicionar uma tarefa (opção 1).
     - Remover uma tarefa (opção 2).
     - Exibir todas as tarefas (opção 3).
     - Sair do programa (opção 4).
     O switch-case é utilizado para processar a escolha do usuário.

2. **Classe `ToDoList`**:
   - **Lista de Tarefas**:
     ```java
     private ArrayList<String> tarefas;
     ```
     A lista de tarefas é armazenada em um `ArrayList`.

   - **Construtor**:
     ```java
     public ToDoList() {
         tarefas = new ArrayList<>();
     }
     ```
     O construtor inicializa a lista de tarefas como uma nova instância de `ArrayList`.

   - **Método para Adicionar Tarefa**:
     ```java
     public void adicionarTarefa(String tarefa) {
         tarefas.add(tarefa);
     }
     ```
     Este método adiciona uma nova tarefa à lista e informa ao usuário.

   - **Método para Remover Tarefa**:
     ```java
     public void removerTarefa(int indice) {
         if (indice >= 0 && indice < tarefas.size()) {
             tarefas.remove(indice);
         }
     }
     ```
     Este método remove uma tarefa com base no índice fornecido e exibe uma mensagem ao usuário. Caso o índice seja inválido, uma mensagem de erro é exibida.

   - **Método para Exibir Tarefas**:
     ```java
     public void exibirTarefas() {
         if (tarefas.isEmpty()) {
             System.out.println("Nenhuma tarefa na lista.");
         } else {
             for (int i = 0; i < tarefas.size(); i++) {
                 System.out.println((i + 1) + ". " + tarefas.get(i));
             }
         }
     }
     ```
     Este método exibe todas as tarefas na lista. Se a lista estiver vazia, uma mensagem apropriada é exibida.

### Modelo de README para GitHub

```markdown
# Lista de Tarefas em Java

Este projeto é uma aplicação simples de lista de tarefas desenvolvida em Java. O usuário pode adicionar, remover e visualizar tarefas em uma lista.

## Funcionalidades

- Adicionar uma nova tarefa à lista.
- Remover uma tarefa existente pelo índice.
- Exibir todas as tarefas da lista.
- Sair da aplicação.

## Como Executar

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git
   ```

2. **Compile e Execute o Programa**:
   Navegue até o diretório do repositório e compile o programa:
   ```bash
   javac -d . Main.java ToDoList.java
   ```
   Depois, execute o programa:
   ```bash
   java todolist.Main
   ```

## Estrutura do Código

O código é dividido em duas classes principais:

- **Main**: Contém o método `main` e a lógica para interação com o usuário através de um menu de opções.
- **ToDoList**: Gerencia a lista de tarefas, incluindo métodos para adicionar, remover e exibir tarefas.

## Exemplo de Uso

Ao iniciar o programa, o usuário verá um menu de opções semelhante a este:

```
Lista de Tarefas:
1. Adicionar tarefa
2. Remover tarefa
3. Exibir tarefas
4. Sair
Escolha uma opção:
```

O usuário pode escolher uma opção digitando o número correspondente. Após adicionar ou remover tarefas, as mensagens de confirmação são exibidas.

```
Tarefa adicionada: Comprar leite
Tarefa removida: Comprar leite
```

A aplicação continua em execução até que o usuário escolha a opção de sair.
```

---

Sinta-se à vontade para personalizar qualquer parte conforme necessário!
