package EjersClase.four;

public abstract class Producto {
    private int numLote;
    private String fecha;

    public Producto(int numLote, String fechaCaducidad) {
        this.numLote = numLote;
        this.fecha = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "numLote=" + numLote +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
