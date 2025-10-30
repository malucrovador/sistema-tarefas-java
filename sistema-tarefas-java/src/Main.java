import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        int opcao;

        do {
            System.out.println("\n===== MENU TAREFAS =====");
            System.out.println("[1] ➜ Nova tarefa");
            System.out.println("[2] ➜ Listar tarefas");
            System.out.println("[3] ➜ Atualizar tarefa");
            System.out.println("[4] ➜ Remover tarefa");
            System.out.println("[0] ➜ Encerrar");
            System.out.println("========================");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome da tarefa: ");
                    String nome = input.nextLine();
                    gerenciador.criarTarefa(nome);
                    break;

                case 2:
                    gerenciador.listarTarefas();
                    break;

                case 3:
                    System.out.print("ID da tarefa: ");
                    int idAtt = input.nextInt();
                    input.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = input.nextLine();
                    System.out.print("Concluída? (true/false): ");
                    boolean concluida = input.nextBoolean();
                    gerenciador.atualizarTarefa(idAtt, novoNome, concluida);
                    break;

                case 4:
                    System.out.print("ID da tarefa: ");
                    int idDel = input.nextInt();
                    gerenciador.removerTarefa(idDel);
                    break;

                case 0:
                    System.out.println("Encerrando... Até a próxima 👋");
                    break;

                default:
                    System.out.println("❌ Opção inválida!");
            }

        } while (opcao != 0);

        input.close();
    }
}
