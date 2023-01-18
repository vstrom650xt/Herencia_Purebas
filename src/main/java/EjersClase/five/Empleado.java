package EjersClase.five;

public abstract class Empleado {
//FALTA LO DEL SUEPERVISOR
    private  Empleado supervisor;
    private String nombre,apellido,DNI,direccion,telefono;
    private int antigue;
    private float salario;

    public Empleado(String nombre, String apellido, String DNI, String direccion, String telefono, float salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.antigue=0;

    }


    public void increSalario(float incremento ){
        salario+=salario*incremento;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public  abstract void imprimir();
    @Override
    public String toString() {
        return "Empleado{" +
                "supervisor=" + supervisor +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", antigue=" + antigue +
                ", salario=" + salario +
                '}';
    }
}
