package ejerciciotraineeonready;

import java.util.Comparator;

public class ComparadorPorPrecio implements Comparator<Vehiculo> {

    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {
        if(v1.getPrecio() > v2.getPrecio()) {
            return 1;
        } else {
            if(v1.getPrecio() < v2.getPrecio()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
