package ejercicioMultimedia;

public class Multimedia {

    // VARIABLES
    private String titulo;
    private String formato;
    private double duracion;

    // CONSTANTES
    static private final String[] formatoTipos = {"mp3", "wav", "aac", "mp4", "mkv", "mov", "flv"};

    // CONSTRUCTOR
    public Multimedia(String titulo, String formato, double duracion) {
        this.titulo = titulo;
        this.formato = validarFormato(formato);
        this.duracion = duracion;
    }

    // GETTERS
    public String getTitulo() {
        return this.titulo;
    }

    public String getFormato() {
        return this.formato;
    }

    public double getDuracion() {
        return this.duracion;
    }

    // METODOS
    public boolean equals(Multimedia multimedia) {
        boolean comparacionFormato = this.formato.equals(multimedia.getFormato());
        boolean comparacionDuracion = this.duracion == multimedia.getDuracion();

        return (comparacionFormato && comparacionDuracion);
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = "Titulo: " + this.titulo + "\n";
        mensaje += "Formato: " + this.formato + "\n";
        mensaje += "Duracion: " + this.duracion + "\n";
        return mensaje;
    }

    // VALIDACIONES
    private String validarFormato(String formato) {
        
        for (int i = 0; i < this.formatoTipos.length; i++) {
            if (formato.equals(this.formatoTipos[i])) {
                return formato;
            }
        }
        return formato;
    }

}
