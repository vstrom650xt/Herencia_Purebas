package ieslavereda;

public enum Grado {

    DAM(1,"multi"),
    DAW(1,"web"),
    ASIR(1,"admin"),
    SMR(1,"sistemas"),
    DAM2(2,"multi"),
    DAW2(2,"web"),
    ASIR2(2,"admin"),
    SMR2(2,"sistemas");

    private Grado(int curso,String espec){
        this.curso=curso;
        this.especialidad=espec;


    }

    private int curso;
    String especialidad;




}
