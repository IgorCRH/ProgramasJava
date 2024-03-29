import java.util.Objects;
class Tarefa {
    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public void marcarComoNaoConcluida() {
        this.concluida = false;
    }

    @Override
    public String toString() {
        String status = concluida ? "Concluída" : "Não concluída";
        return "Tarefa [id=" + id + ", descricao=" + descricao + ", status=" + status + "]";
    }
}