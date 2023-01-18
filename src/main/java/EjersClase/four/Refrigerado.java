package EjersClase.four;

public class Refrigerado extends Producto{
    private int codOrganismo;

    public Refrigerado(int numLote, String fechaCaducidad,int codOrganismo) {
        super(numLote, fechaCaducidad);
        this.codOrganismo= codOrganismo;
    }

    @Override
    public String toString() {
        return "Refrigerado{" +
                "codOrganismo=" + codOrganismo +
                "} " + super.toString();
    }
}
