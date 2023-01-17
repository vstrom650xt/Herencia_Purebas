package ieslavereda;

public class EqDirectivo extends Profesor{
     private  String cargo;
     private Profesor [] profes;


    public EqDirectivo(String DNI, String nombre, String apellidos, int edad, Profesor ... profes) {
        super(DNI, nombre, apellidos, edad);
        this.profes=profes;
    }

    @Override
    public String toString() {
        return "EqDirectivo{" +
                "cargo='" + cargo + '\'' +
                "} " + super.toString();
    }


}
