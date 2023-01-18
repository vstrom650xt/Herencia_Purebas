package ieslavereda;

import java.util.Arrays;

public class EqDirectivo extends Profesor{
     private  String cargo;
     private Profesor [] profes;


    @Override
    public String toString() {
        return "EqDirectivo -> "  +
                "cargo = " + cargo + "\n" +
                "profesorado :" +
                Arrays.toString(profes) +"\n";
    }


    public EqDirectivo(String DNI, String nombre, String apellidos, int edad, String cargo , Profesor ... profes) {
        super(DNI, nombre, apellidos, edad);
        this.profes=profes;
        this.cargo=cargo;
    }

//    @Override
//    public String toString() {
//        return "EqDirectivo{" +
//                "cargo='" + cargo + '\'' +
//                ", profesores=" + Arrays.toString(profes) +
//                "} " + super.toString();
//    }

}
