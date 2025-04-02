package ejercicioProductos;

public class ProductoCongelado extends Producto {

    // ATRIBUTOS
    private String fechaEnvasado;
    private String paisOrigen;
    private double temperaturaRecomendada;

    // CONSTRUCTOR
    public ProductoCongelado(
            String fechaCaducidad,
            String numeroLote,
            String fechaEnvasado,
            String paisOrigen,
            double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    // GETTERS
    public String getFechaEnvasado() {
        return this.fechaEnvasado;
    }

    public String getPaisOrigen() {
        return this.paisOrigen;
    }

    public double getTemperaturaRecomendada() {
        return this.temperaturaRecomendada;
    }
    
    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = super.toString();
        mensaje += "Fecha de envasado: " + this.fechaEnvasado + "\n";
        mensaje += "Temperatura recomendada: " + this.temperaturaRecomendada + "\n";
        mensaje += "Pais de origen: " + this.paisOrigen + "\n";
        return mensaje;
    }

}
