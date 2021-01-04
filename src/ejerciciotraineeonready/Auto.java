package ejerciciotraineeonready;

public class Auto extends Vehiculo {
    
    private int cantPuertas;

    public Auto(int cantPuertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Puertas: " + this.cantPuertas + " // Precio: $" + super.getPrecio() + "\n";
        
    }
}
