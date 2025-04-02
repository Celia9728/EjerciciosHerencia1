
package ejercicioProductos.Congelados;

import ejercicioProductos.ProductoCongelado;

public class CongeladoPorAgua extends ProductoCongelado{
    // ATRIBUTOS
     private double salGL;
     
     // CONSTRUCTORES

    public CongeladoPorAgua(double salGL, String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.salGL = salGL;
    }
     
    // GETTERS
    public double getSalGL() {
        return this.salGL;
    }
    
    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = super.toString();
        mensaje += "Salinidad del agua: " + this.salGL + "g/l \n";
        return mensaje;
    }
}
