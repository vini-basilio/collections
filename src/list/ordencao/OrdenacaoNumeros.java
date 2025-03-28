package list.ordencao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;
    private ComparatorNumeros comparador;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
        this.comparador = new ComparatorNumeros();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        var listaAscendente = new ArrayList<>(numeros);
        Collections.sort(listaAscendente, comparador);
        return listaAscendente;
    }

    public List<Integer> ordenarDescendente() {
        var listaAscendente = new ArrayList<>(numeros);
        Collections.sort(listaAscendente, comparador);

        return listaAscendente.reversed();

    }

    public static void main(String[] args) {

        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();
        listaNumeros.adicionarNumero(10);
        listaNumeros.adicionarNumero(3);
        listaNumeros.adicionarNumero(5);
        listaNumeros.adicionarNumero(0);

        System.out.println(listaNumeros.ordenarAscendente());
        System.out.println(listaNumeros.ordenarDescendente());
    }
}
