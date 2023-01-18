package EjersClase.one;

import EjersClase.one.Formato;
import EjersClase.one.Multimedia;

public class Pruebas {
    public static void main(String[] args) {
//        Multimedia m = new Multimedia("pp2","lo", Formato.DISO,6);
//        Multimedia m2 = new Multimedia("pp","lo",Formato.DISO,6);
//        System.out.println(m.equals(m2));

        Pelicula p = new Pelicula("pp","lo",Formato.DISO,6);
        Pelicula p2 = new Pelicula("pp","lo",Formato.PELICULA,6,"ptt");

        System.out.println(p2);

        Disco pp = new Disco("pp","lo",Formato.DISO,6,Genero.OPERA);
        System.out.println(pp);


    }
}
