package list.operacoesbasicas.carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItems;

    public CarrinhoDeCompras() {
        this.listaItems = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItems.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        listaItems.removeIf(i -> i.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal() {
        double total = 0.0;

        for (Item item : listaItems) {
            total = total + (item.getQuantidade() * item.getPreco());
        }

        return total;
    }

    public void exibirItens() {
        System.out.println(listaItems);
    }

    public static void main(String[] args) {
        var listaItems = new CarrinhoDeCompras();

        listaItems.adicionarItem("Caneca", 30.0, 2);
        listaItems.adicionarItem("Café", 40.0, 1);

        listaItems.exibirItens();
        System.out.println("Total da compra: " + listaItems.calcularValorTotal());

        listaItems.removerItem("Caneca");

        listaItems.exibirItens();
        System.out.println("Total da compra: " + listaItems.calcularValorTotal());
    }
}
