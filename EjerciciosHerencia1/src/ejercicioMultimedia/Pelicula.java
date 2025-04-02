package ejercicioMultimedia;

public class Pelicula extends Multimedia {

    // VARIABLES
    private String actorPrincipal;
    private String actrizPrincipal;

    // CONSTRUCTOR
    public Pelicula(String titulo, String formato, double duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    // GETTERS
    public String getActorPrincipal() {
        return this.actorPrincipal;
    }

    public String getActrizPrincipal() {
        return this.actrizPrincipal;
    }

    // METODO EQUALS
    public boolean equals(Pelicula pelicula) {
        boolean esIgual= true;
        
        boolean comparacionMultimedia = super.equals(pelicula);
        boolean comparacionActor = this.actorPrincipal.equals(pelicula.actorPrincipal);
        boolean comparacionActriz = this.actrizPrincipal.equals(pelicula.actrizPrincipal);

        
        if (!comparacionActor && comparacionActriz) {
            esIgual = false;
        } else{
            
        }
        
        return esIgual;
    }
    
    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = super.toString();
        mensaje += "Actor principal: " + this.actorPrincipal + "\n";
        mensaje += "Actriz principal: " + this.actrizPrincipal + "\n";
        return mensaje;
    }

}
