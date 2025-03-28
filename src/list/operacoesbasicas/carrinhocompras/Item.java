package list.operacoesbasicas.carrinhocompras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String descricao = String.format(
                """
                        Nome: %s
                        Preço: %.2f
                        Quantidade: %d
                        """, nome, preco, quantidade);

        return descricao;
    }

}
