package ejercicioMamifero;

public class Perro extends Mamifero{

    private String raza;
    private String nombre;
    private boolean esMezcla;

    public Perro(int numeroPatas, int mediaVida, String raza, String nombre) {
        super(numeroPatas, mediaVida);
        this.raza = raza;
        this.nombre = nombre;
        this.esMezcla = false;
    }

    public boolean getEsMezcla() {
        return this.esMezcla;
    }

    public void setEsMezcla(boolean esMezcla) {
        this.esMezcla = esMezcla;
    }

    @Override
    public String comunicarse() {
        return "ladrido";
    }

    @Override
    public void dormir() {
        System.out.println(18);
    }

    public String jugar() {
        return this.nombre + " esta jugando";
    }

    public String toString() {
        String mensaje = super.toString();
        mensaje += "Raza: " + this.raza + "\n";
        mensaje += "Nombre: " + this.nombre + "\n";
        mensaje += "Es mezcla: " + this.esMezcla + "\n";
        return mensaje;
    }
}
