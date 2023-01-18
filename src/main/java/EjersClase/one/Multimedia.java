package EjersClase.one;

public class Multimedia {



    private String titulo, autor;
    private int duracion;

    private Formato formato;




    public Multimedia(String titulo, String autor, Formato formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }



    public int getDuracion() {
        return duracion;
    }
//    @Override
//    public boolean equals(Object o) {
//
//        if(! (o instanceof  Coordinate))
//            return  false;
//        Coordinate c = (Coordinate) o;
//        return (c.getLetter()==this.letter)&& (c.getNumber() == this.number);
//
//    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Multimedia))
            return false;

        Multimedia media = (Multimedia) o;
        return (media.getTitulo()==this.titulo) &&(media.getAutor()==this.autor);
    }
    @Override
    public String toString() {
        return "Multimedia{" +
                "título='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                ", duración=" + duracion +
                '}';
    }
}
