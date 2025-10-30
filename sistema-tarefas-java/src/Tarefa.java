public class Tarefa {
    private int id;
    private String nome;
    private boolean concluida;

    public Tarefa(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.concluida = false;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + nome + " | Status: " + 
               (concluida ? "✅ Concluída" : "⌛ Pendente");
    }
}
