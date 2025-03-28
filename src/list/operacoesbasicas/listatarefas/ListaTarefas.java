package list.operacoesbasicas.listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void obterTarefas() {
        System.out.println(listaTarefas);
    }

    public void removerTarefa(String descricao) {
        // List<Tarefa> tarefasRemover = new ArrayList<>();

        // for (Tarefa t : listaTarefas) {
        // if (t.getDescricao().equalsIgnoreCase(descricao)) {
        // tarefasRemover.add(t);
        // }
        // }
        // listaTarefas.removeAll(tarefasRemover);

        // Mudei o codigo do curso para melhor uso de RAM
        listaTarefas.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeriTotalTarefas() {
        return listaTarefas.size();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeriTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");

        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeriTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 1");

        System.out.println(
                "O número total de elementos na lista após a exclusão é: " + listaTarefas.obterNumeriTotalTarefas());

        listaTarefas.obterTarefas();
    }
}
