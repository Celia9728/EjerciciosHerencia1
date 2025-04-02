package ejercicioProductos;

public class ProductoFresco extends Producto {

    // ATRIBUTOS
    private String fechaEnvasado;
    private String metodoConservacion;

    // CONSTRUCTOR
    public ProductoFresco(
            String fechaCaducidad, 
            String paisOrigen, 
            String fechaEnvasado, 
            String metodoConservacion) {
        super(fechaCaducidad, paisOrigen);
        this.fechaEnvasado = fechaEnvasado;
        this.metodoConservacion = metodoConservacion;
    }

    // GETTERS
    public String getFechaEnvasado() {
        return this.fechaEnvasado;
    }

    public String getMetodoConservacion() {
        return this.metodoConservacion;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = super.toString();
        mensaje += "Fecha de envasado: " + this.fechaEnvasado + "\n";
        mensaje += "Metodo de conservacion: " + this.metodoConservacion + "\n";
        return mensaje;
    }

}
