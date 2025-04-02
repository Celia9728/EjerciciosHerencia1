package ejercicioMamifero;

public class Mamifero {

    private int numeroPatas;
    private int mediaVida;

    public Mamifero(int numeroPatas, int mediaVida) {
        this.numeroPatas = numeroPatas;
        this.mediaVida = mediaVida;
    }

    public int getNumeroPatas() {
        return this.numeroPatas;
    }

    public String comunicarse() {
        return "";
    }

    public void dormir() {
        System.out.println(8);
    }

    public String toString() {
        String mensaje;
        mensaje = "Numero de patas: " + this.numeroPatas + "\n";
        mensaje = "Media de vida: " + this.mediaVida + "\n";
        return mensaje;
    }
}
