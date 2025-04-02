package ejercicioMultimedia;

public class mainMultimedia {

    public static void main(String[] args) {

        Multimedia m1 = new Multimedia("hola", "asd", 2.8);
        Multimedia m2 = new Multimedia("hola", "mp4", 2.8);

        System.out.println(m1.equals(m2));

        Pelicula p1 = new Pelicula("adios", "aac", 150, "Javi", "Annabel");
        Pelicula p2 = new Pelicula("adios", "aac", 150, "Javi", "Annabel");

        System.out.println(p1.equals(p2));
    }

}
