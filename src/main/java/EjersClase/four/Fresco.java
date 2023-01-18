package EjersClase.four;

public class Fresco extends Producto{

    private String fechaEnvasado;
    private String paisOrigen;

    public Fresco(int numLote, String fechaCaducidad,String paisOrigen,String fechaEnvasado) {
        super(numLote, fechaCaducidad);
        this.fechaEnvasado=fechaCaducidad;
        this.paisOrigen= paisOrigen;
    }

    @Override
    public String toString() {
        return "Fresco{" +
                "fechaEnvasado='" + fechaEnvasado + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                "} " + super.toString();
    }
}
