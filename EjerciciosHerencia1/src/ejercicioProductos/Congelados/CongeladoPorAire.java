package ejercicioProductos.Congelados;

import ejercicioProductos.ProductoCongelado;

public class CongeladoPorAire extends ProductoCongelado {

    // ATRIBUTOS
    private double nitrogeno;
    private double oxigeno;
    private double dioxidoCarbono;
    private double vaporAgua;

    // CONSTRUCTOR
    public CongeladoPorAire(
            String fechaCaducidad,
            String numeroLote,
            String fechaEnvasado,
            String paisOrigen,
            double temperaturaRecomendada,
            double nitrogeno,
            double oxigeno,
            double dioxidoCarbono,
            double vaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporAgua = vaporAgua;
    }

    // GETTERS
    public double getNitrogeno() {
        return this.nitrogeno;
    }

    public double getOxigeno() {
        return this.oxigeno;
    }

    public double getDioxidoCarbono() {
        return this.dioxidoCarbono;
    }

    public double getVaporAgua() {
        return this.vaporAgua;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = super.toString();
        mensaje += "Nitrogero: " + this.nitrogeno + "% \n";
        mensaje += "Oxigeno: " + this.oxigeno + "% \n";
        mensaje += "Dioxido de carbono: " + this.dioxidoCarbono + "% \n";
        mensaje += "Vapor de agua: " + this.vaporAgua + "% \n";
        return mensaje;
    }
}
