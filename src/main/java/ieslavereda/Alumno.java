package ieslavereda;

public class Alumno extends Persona{


    private int NIA;
    private Grado grado;
    
    public Alumno(String DNI, String nombre, String apellidos, int edad,Grado grado) {
        super(DNI, nombre, apellidos, edad);
        this.grado = grado;
        this.NIA = generateNIA();

    }

    public Alumno(String DNI, String nombre, String apellidos, int edad, int NIA, Grado grado) {
        super(DNI, nombre, apellidos, edad);
        this.NIA = NIA;
        this.grado = grado;
    }
    //para sobreescribir un metodo tiene que devolver lo mismo
    @Override
    public void printDNI(){
        super.printDNI();
    }

    public int generateNIA() {
        return (int)(Math.random()*100000000);
    }

    @Override
    public String toString() {
        return super.toString()+" "+", NIA "+ NIA + " ,grado " + grado +"}";
    }

}
