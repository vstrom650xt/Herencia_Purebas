package ieslavereda;

import java.util.Arrays;

public class Profesor extends Persona {


    private Grado[] grados;

    public Profesor(String DNI, String nombre, String apellidos, int edad,Grado ... grados) {
        super(DNI, nombre, apellidos, edad);
        this.grados=grados;
    }

//    public

    @Override
    public String toString() {
        return "\n"+"Profesor -> " +
                "grados=" + Arrays.toString(grados) +
                 super.toString();
    }

}
