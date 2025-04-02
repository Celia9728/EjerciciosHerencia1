package ejercicioEmpleado;

public class Operario extends Empleado {

    private int codigoTrabajador;

    public Operario(String nombre, int codigoTrabajador) {
        super(nombre);
        this.codigoTrabajador = codigoTrabajador;
    }

    public int getCodigoTrabajador() {
        return this.codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public String toString() {
        String mensaje;
        mensaje = "Soy el operario " + super.getNombre() + " con el código " + this.codigoTrabajador;
        return mensaje;
    }

}
