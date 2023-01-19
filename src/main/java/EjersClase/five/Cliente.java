package EjersClase.five;

public class Cliente {
    private String nombre,apellido,DNI,direccion,telefono,fecha;
    private int numComprados;



    public Cliente(String nombre, String apellido, String DNI, String direccion, String telefono, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha = fecha;
        this.numComprados = 0;
    }

    public String getDNI() {
        return DNI;
    }

    public void increComprados(){
        numComprados++;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fecha='" + fecha + '\'' +
                ", numComprados=" + numComprados +
                '}';
    }
}
