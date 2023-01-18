package EjersClase.one;

import EjersClase.one.Formato;
import EjersClase.one.Multimedia;

public class Pelicula extends Multimedia {
    private String mainActor;
    private String mainActriz;


    //esto es una constante de verdad con el static y el final si es static no se puede hacer geters ni setters
    //si se pone final static no hace falta q sea privado por q ya no va a cambiar tendria que ser protected
    private static final String text = "animacion";


    public Pelicula(String titulo, String autor, Formato formato, int duracion, String mainActor, String mainActriz) {
        super(titulo, autor, formato, duracion);
        this.mainActor = mainActor;
        this.mainActriz = mainActriz;

    }

    public Pelicula(String titulo, String autor, Formato formato, int duracion, String mainActor) {
        super(titulo, autor, formato, duracion);
        this.mainActor = mainActor;
    }


    public Pelicula(String titulo, String autor, Formato formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.mainActor=text;
        this.mainActriz=text;

    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "mainActor='" + mainActor + '\'' +
                ", mainActriz='" + mainActriz + '\'' +
                '\'' +
                "} " + super.toString();
    }
}
