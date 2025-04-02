package ejercicioProductos;

public class ProductoRefrigerado extends Producto {

    // ATRIBUTOS
    private int codigoOrganismo;
    private String fechaEnvasado;
    private double temperaturaRecomendada;
    private String paisOrigen;

    // CONSTRUCTOR
    public ProductoRefrigerado(
            String fechaCaducidad,
            String numeroLote,
            int codigoOrganismo,
            String fechaEnvasado,
            double temperaturaRecomendada,
            String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisOrigen = paisOrigen;
    }

    // GETTERS
    public int getCodigoOrganismo() {
        return this.codigoOrganismo;
    }

    public String getFechaEnvasado() {
        return this.fechaEnvasado;
    }

    public double getTemperaturaRecomendada() {
        return this.temperaturaRecomendada;
    }

    public String getPaisOrigen() {
        return this.paisOrigen;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = super.toString();
        mensaje += "Codigo del organismo: " + this.codigoOrganismo + "\n";
        mensaje += "Fecha de envasado: " + this.fechaEnvasado + "\n";
        mensaje += "Temperatura recomendada: " + this.temperaturaRecomendada + "\n";
        mensaje += "Pais de origen: " + this.paisOrigen + "\n";
        return mensaje;
    }
}
