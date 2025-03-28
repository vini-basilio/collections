package list.operacoesbasicas;

public class Tarefa {

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Tarefa " + descricao;
    }
}
