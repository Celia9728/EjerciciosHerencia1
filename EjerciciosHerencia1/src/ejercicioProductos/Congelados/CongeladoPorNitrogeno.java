package ejercicioProductos.Congelados;

import ejercicioProductos.ProductoCongelado;

public class CongeladoPorNitrogeno extends ProductoCongelado {

    // ATRIBUTOS
    private String metodoCongelacion;
    private int tiempoExposicion;

    // CONSTRUCTOR
    public CongeladoPorNitrogeno(String metodoCongelacion, int tiempoExposicion, String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    // GETTERS
    public String getMetodoCongelacion() {
        return this.metodoCongelacion;
    }

    public int getTiempoExposicion() {
        return this.tiempoExposicion;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = super.toString();
        mensaje += "Metodo congelacion: " + this.metodoCongelacion + "\n";
        mensaje += "Tiempo de exposicion: " + this.tiempoExposicion + "s \n";
        return mensaje;
    }
}
