package ejerciciotraineeonready;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Concesionaria {
    
    private List<Vehiculo> vehiculos;
    
    public Concesionaria() {
	this.vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
    
   public List<Vehiculo> buscarVehiculoConLetra(String letra) {
        List<Vehiculo> aux = new ArrayList<>();
        
        for(int i = 0; i < this.vehiculos.size(); i++) {
            if(this.vehiculos.get(i).getModelo().contains(letra))
                aux.add(this.vehiculos.get(i));
        }
        return aux;
    }
    
    @Override
    public String toString() {
        return " " + vehiculos;
    }

    public List<Vehiculo> ordenar(Comparator<Vehiculo> comparador) {
        List<Vehiculo> aux = this.vehiculos;
        Collections.sort(aux, comparador);
        return aux;
    }
    
    
}
