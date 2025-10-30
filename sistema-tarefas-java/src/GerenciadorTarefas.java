
import java.util.ArrayList;

public class GerenciadorTarefas {
    
    private ArrayList<Tarefa> tarefas = new ArrayList<>();
    private int contadorId = 1;

    public void criarTarefa(String nome) {
        Tarefa tarefa = new Tarefa(contadorId, nome);
        tarefas.add(tarefa);
        contadorId++;
        System.out.println("✅ Tarefa adicionada com sucesso!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada ainda!");
            return;
        }
        System.out.println("\n📋 Lista de Tarefas:");
        tarefas.forEach(System.out::println);
    }

    public void atualizarTarefa(int id, String novoNome, boolean concluida) {
        Tarefa tarefa = buscarPorId(id);

        if (tarefa == null) {
            System.out.println("❌ Tarefa não encontrada!");
            return;
        }

        tarefa.setNome(novoNome);
        tarefa.setConcluida(concluida);
        System.out.println("✅ Tarefa atualizada com sucesso!");
    }

    public void removerTarefa(int id) {
        Tarefa tarefa = buscarPorId(id);

        if (tarefa == null) {
            System.out.println("❌ Tarefa não encontrada!");
            return;
        }

        tarefas.remove(tarefa);
        System.out.println("✅ Tarefa removida com sucesso!");
    }

    private Tarefa buscarPorId(int id) {
        return tarefas.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }
}
