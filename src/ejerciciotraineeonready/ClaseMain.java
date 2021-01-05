package ejerciciotraineeonready;

import java.util.Comparator;
import java.util.List;

public class ClaseMain {
    
    public static void main(String[] args) {
        
        Vehiculo auto1 = new Auto(4, "Peugeot", "206", 200000);
        Vehiculo auto2 = new Auto(5, "Peugeot", "208", 250000);
        Vehiculo moto1 = new Moto(125, "Honda", "Titan", 60000);
        Vehiculo moto2 = new Moto(160, "Yamaha", "YBR", 80500.50);
        
        Comparator<Vehiculo> comparadorPorPrecio = new ComparadorPorPrecio();
        Comparator<Vehiculo> comparadorReversa = new ComparadorReversa(comparadorPorPrecio);
        
        Concesionaria concesionaria = new Concesionaria();
        
        concesionaria.agregarVehiculo(auto1);
        concesionaria.agregarVehiculo(moto1);
        concesionaria.agregarVehiculo(auto2);
        concesionaria.agregarVehiculo(moto2);
        
        System.out.println(concesionaria.toString().replace(",", "").replace("[", "").replace("]", ""));
        System.out.println("==========================================================================");
        
        List<Vehiculo> salida = concesionaria.ordenar(comparadorReversa);
        int ultimo = salida.size() - 1;
        
        System.out.println("Vehìculo màs caro: " + salida.get(0).getMarca() + " " + salida.get(0).getModelo());
        System.out.println("==========================================================================");
        
        System.out.println("Vehìculo màs Barato: " + salida.get(ultimo).getMarca() + " " + salida.get(ultimo).getModelo());
        System.out.println("==========================================================================");
        
        if(concesionaria.buscarVehiculoConLetra("Y").size() == 0)
            System.out.println("No hay vehìculos con la letra Y");
        else 
            for(int i = 0; i < concesionaria.buscarVehiculoConLetra("Y").size(); i++) {
                System.out.println("Vehìculo que contiene en el modelo la letra Y: " + concesionaria.buscarVehiculoConLetra("Y").get(i).getMarca() + " "
                + concesionaria.buscarVehiculoConLetra("Y").get(i).getModelo() + " $" + concesionaria.buscarVehiculoConLetra("Y").get(i).getPrecio()); 
            }
        System.out.println("==========================================================================");
        
        System.out.println("Vehiculos ordenados por precio de mayor a menor:");
        
        for(int i = 0; i < salida.size(); i++) {
            System.out.println(salida.get(i).getMarca() + " " + salida.get(i).getModelo());
        }
    }
}
