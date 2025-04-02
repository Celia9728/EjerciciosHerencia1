package ejercicioEmpleado;

public class Tecnico extends Operario {
    // CONSTRUCTOR

    public Tecnico(String nombre, int codigoTrabajador) {
        super(nombre, codigoTrabajador);
    }

    // TO STRING
    public String toString() {
        String mensaje;
        mensaje = "Soy el técnico " + super.getNombre() + " con el código " + super.getCodigoTrabajador();
        return mensaje;
    }
}
