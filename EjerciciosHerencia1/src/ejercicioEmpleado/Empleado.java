package ejercicioEmpleado;

public class Empleado {

    // VARIABLES
    private String nombre;

    // CONSTRUCTOR
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // GET
    public String getNombre() {
        return this.nombre;
    }

    // SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String mensaje;
        mensaje = "Soy el empleado " + this.nombre;
        return nombre;
    }
}
