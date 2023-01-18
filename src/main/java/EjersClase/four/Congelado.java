package EjersClase.four;

public class Congelado extends Producto{
    private int temperatura;
    public Congelado(int numLote, String fechaCaducidad, int temperatura) {
        super(numLote, fechaCaducidad);
        this.temperatura=temperatura;

    }

    @Override
    public String toString() {
        return "Congelado{" +
                "temperatura=" + temperatura +
                "} " + super.toString();
    }
}
