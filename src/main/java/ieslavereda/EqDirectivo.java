package ieslavereda;

public class EqDirectivo extends Profesor{
     private  String cargo;


    public EqDirectivo(String DNI, String nombre, String apellidos, int edad) {
        super(DNI, nombre, apellidos, edad);
    }

    @Override
    public String toString() {
        return "EqDirectivo{" +
                "cargo='" + cargo + '\'' +
                "} " + super.toString();
    }


}
