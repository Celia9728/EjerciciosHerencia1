
package ejercicioMultimedia;

public class mainMultimedia {

    public static void main(String[] args) {
        
        Multimedia m1 = new Multimedia("hola", "asd", 2.8);
        Multimedia m2 = new Multimedia("hola", "mp3", 2.8);
        
        System.out.println(m1.equals(m2));
        
    }
    
}
