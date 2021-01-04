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
    
    public String buscarVehiculoMasCaro() {
        double masCaro = this.vehiculos.get(0).getPrecio();
        int indice = 0;
        
        for(int i = 1; i < this.vehiculos.size(); i++) {
            if(this.vehiculos.get(i).getPrecio() > masCaro) {
                masCaro = this.vehiculos.get(i).getPrecio();
                indice = i;
            }
        }
        return this.vehiculos.get(indice).getMarca() + " " + this.vehiculos.get(indice).getModelo();
    }
            
    public String buscarVehiculoMasBarato() {
        double masBarato = this.vehiculos.get(0).getPrecio();
        int indice = 0;
        
        for(int i = 1; i < this.vehiculos.size(); i++) {
            if(this.vehiculos.get(i).getPrecio() < masBarato) {
                masBarato = this.vehiculos.get(i).getPrecio();
                indice = i;
            }
        }
        return this.vehiculos.get(indice).getMarca() + " " + this.vehiculos.get(indice).getModelo();
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
