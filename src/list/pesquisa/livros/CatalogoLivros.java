package list.pesquisa.livros;

import java.util.LinkedList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new LinkedList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {

        if (listaLivros.isEmpty())
            return listaLivros;

        var livrosPorAutor = listaLivros.stream()
                .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                .toList();

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (listaLivros.isEmpty())
            return listaLivros;

        var livrosPorIntervalo = listaLivros.stream()
                .filter(l -> l.getAnoPublicacao() >= anoInicial & l.getAnoPublicacao() <= anoFinal)
                .toList();

        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroFiltrado = null;

        if (listaLivros.isEmpty())
            return livroFiltrado;

        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroFiltrado = livro;
                break;
            }
        }

        return livroFiltrado;
    }

    public static void main(String[] args) {
        var catalogoLivros = new CatalogoLivros();
        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro(
                "Microsserviços Prontos Para a Produção",
                "Susan J. Fowler",
                2017);
        catalogoLivros.adicionarLivro(
                "Java Guia do Programador",
                "Peter Jandl Junior",
                2021);
        catalogoLivros.adicionarLivro(
                "Código Limpo",
                "Robert C. Martin",
                2009);
        catalogoLivros.adicionarLivro(
                "O Codificador Limpo",
                "Robert C. Martin",
                2012);

        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

        // Exibindo livros por título (caso em que não há livros com o título
        // especificado)
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}
