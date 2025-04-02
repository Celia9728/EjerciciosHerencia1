package ejercicioMultimedia;

public class Cancion extends Multimedia {

    // VARIABLES
    private String artista;
    private String editor;
    private String genero;

    // CONSTANTES
    private static final String[] generoTipos = {"pop", "rock", "flamenco", "hiphop", "R&B", "reggaeton"};

    // CONSTRUCTOR
    public Cancion(String titulo, String formato, double duracion, String artista, String editor, String genero) {
        super(titulo, formato, duracion);
        this.artista = artista;
        this.editor = editor;
        this.genero = validarGenero(genero);
    }

    // GETTERS
    public String getArtista() {
        return this.artista;
    }

    public String geteditor() {
        return this.editor;
    }

    public String getGenero() {
        return this.genero;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = super.toString();
        mensaje += "Artista: " + this.artista + "\n";
        mensaje += "Editor: " + this.editor + "\n";
        mensaje += "Género: " + this.genero + "\n";
        return mensaje;
    }

    // VALIDACIONES
    private String validarGenero(String genero) {
        for (int i = 0; i < this.generoTipos.length; i++) {
            if (genero.equals(this.generoTipos[i])) {
                return genero;
            }
        }
        return genero;
    }

}
