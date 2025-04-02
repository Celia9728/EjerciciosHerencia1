
package ejercicioMamifero;

public class mainMamifero {

    public static void main(String[] args) {
        Perro perro1 = new Perro(4, 10, "labrador", "Antonio");
        Perro perro2 = new Perro(3, 15, "Galgo", "Adri");

        perro1.comunicarse();
        perro2.dormir();
        System.out.println(perro1);
        System.out.println(perro2);

        Gato gato1 = new Gato(4, 10, "comun", "Freya");
        System.out.println(gato1);

        gato1.setPelaje("largo");
        System.out.println(gato1);

        gato1.setPelaje("largoo");
        System.out.println(gato1);
    }
    
}
