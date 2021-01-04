package ejerciciotraineeonready;

import java.util.Comparator;

public class ComparadorReversa implements Comparator<Vehiculo> {
    
    private Comparator<Vehiculo> comparador;

    public ComparadorReversa(Comparator<Vehiculo> comparador) {
        this.comparador = comparador;
    }

    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {
        return this.comparador.compare(v1, v2) * (-1);
    }
}
