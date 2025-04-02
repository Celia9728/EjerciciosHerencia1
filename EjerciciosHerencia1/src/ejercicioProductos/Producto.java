package ejercicioProductos;

public class Producto {

    // ATRIBUTOS
    private String fechaCaducidad;
    private String numeroLote;

    // CONSTRUCTOR
    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    // GETTERS
    public String getFechaCaducidad() {
        return this.fechaCaducidad;
    }

    public String getNumeroLote() {
        return this.numeroLote;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = "Fecha de caducidad: " + this.fechaCaducidad + "\n";
        mensaje += "Numero de lote: " + this.numeroLote + "\n";
        return mensaje;
    }
}
