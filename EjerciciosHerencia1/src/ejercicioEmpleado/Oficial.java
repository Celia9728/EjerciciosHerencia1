package ejercicioEmpleado;

public class Oficial extends Operario {

    // CONSTRUCTOR
    public Oficial(String nombre, int codigoTrabajador) {
        super(nombre, codigoTrabajador);
    }

    // TO STRING
    public String toString() {
        String mensaje;
        mensaje = "Soy el oficial " + super.getNombre() + " con el código " + super.getCodigoTrabajador();
        return mensaje;
    }
}
