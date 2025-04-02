
package ejercicioMamifero;

public class Gato extends Mamifero{
    private String raza;
    private String nombre;
    private String pelaje;

    private static final String[] pelajeTipos = {"corto", "semilargo", "largo"};

    public Gato(int numeroPatas, int mediaVida, String raza, String nombre) {
        super(numeroPatas, mediaVida);
        this.raza = raza;
        this.nombre = nombre;
        this.pelaje = "corto";
    }

    public String getPelaje() {
        return this.pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = validarPelaje(pelaje);
    }

    @Override
    public String comunicarse() {
        return "maulla";
    }

    @Override
    public void dormir() {
        System.out.println(15);
    }

    public String cazar() {
        return "Mi gato " + super.getNumeroPatas() + " patas está cazando.";
    }

    public String toString() {
        String mensaje = super.toString();
        mensaje += "Raza: " + this.raza + "\n";
        mensaje += "Nombre: " + this.nombre + "\n";
        mensaje += "Pelaje: " + this.pelaje + "\n";
        return mensaje;
    }
    
    public String validarPelaje (String pelaje){
        for (int i = 0; i < this.pelajeTipos.length; i++) {
            if (pelajeTipos[i].equalsIgnoreCase(pelaje)) {
                return pelaje;
            }
        }
        return "corto";
    }
}
