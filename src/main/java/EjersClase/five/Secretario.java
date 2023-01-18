package EjersClase.five;

public class Secretario extends Empleado{

    private String despacho,numFax;

    private static final float aumento = 1.05f;

    public Secretario(String nombre, String apellido, String DNI, String direccion, String telefono, float salario,String despacho, String numFax) {
        super(nombre, apellido, DNI, direccion, telefono, salario);
        this.despacho= despacho;
        this.numFax= numFax;
    }

    public float getAumento() {
        return aumento;
    }

    @Override
    public void imprimir() {

    }

    @Override
    public String toString() {
        return "Secretario{" +
                "despacho='" + despacho + '\'' +
                ", numFax='" + numFax + '\'' +
                ", aumento=" + aumento +
                "} " + super.toString();
    }
}
