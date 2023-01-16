package ieslavereda;

import java.util.Arrays;

public class Profesor extends Persona {


    private Grado[] grados = new Grado[5];

    public Profesor(String DNI, String nombre, String apellidos, int edad) {
        super(DNI, nombre, apellidos, edad);
    }
    @Override
    public String toString() {
        return "Profesor{" +
                "grados=" + Arrays.toString(grados) +
                "} " + super.toString();
    }

}
