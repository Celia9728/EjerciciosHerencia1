package ejercicioEmpleado;

public class Directivo extends Empleado {

    // CONSTRUCTOR
    public Directivo(String nombre) {
        super(nombre);
    }

    // TO STRING
    public String toString() {
        String mensaje;
        mensaje = "Soy " + super.getNombre() + ", directivo de la empresa";
        return mensaje;
    }
}
