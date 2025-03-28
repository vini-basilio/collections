package set.operacoesbasicas.exercicio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {

        for (String p : palavras) {
            if (p.equalsIgnoreCase(palavra)) {
                palavras.remove(p);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra) {
        for (String p : palavras) {
            if (p.equalsIgnoreCase(palavra)) {
                System.out.println(palavra + " já está no conjunto");
                break;
            }
        }
    }

    public void exibirPalavrasUnicas() {
        for (String p : palavras) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Teste");
        conjuntoPalavrasUnicas.adicionarPalavra("Teste");
        conjuntoPalavrasUnicas.adicionarPalavra("Bob");
        conjuntoPalavrasUnicas.adicionarPalavra("Alice");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("Alice");
        conjuntoPalavrasUnicas.removerPalavra("Teste");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
