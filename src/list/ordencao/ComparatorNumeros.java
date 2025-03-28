package list.ordencao;

import java.util.Comparator;

public class ComparatorNumeros implements Comparator<Integer> {

    @Override
    public int compare(Integer numero1, Integer numero2) {
        return Integer.compare(numero1, numero2);
    }
}
