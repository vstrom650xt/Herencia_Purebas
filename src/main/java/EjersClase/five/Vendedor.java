package EjersClase.five;

import java.util.Arrays;

public class Vendedor {
    private Coche coche;
    private String telefono , areaVenta;
    private String [] clientes;
    private final float comision =0.10f;

    public Vendedor(Coche coche, String telefono, String areaVenta, String[] clientes) {
        this.coche = coche;
        this.telefono = telefono;
        this.areaVenta = areaVenta;
        this.clientes = clientes;
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "coche=" + coche +
                ", telefono='" + telefono + '\'' +
                ", areaVenta='" + areaVenta + '\'' +
                ", clientes=" + Arrays.toString(clientes) +
                ", comision=" + comision +
                '}';
    }
}
