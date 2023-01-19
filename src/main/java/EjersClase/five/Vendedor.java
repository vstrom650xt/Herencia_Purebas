package EjersClase.five;

import java.util.Arrays;
import java.util.Scanner;

public class Vendedor {
    private Coche coche;
    private String telefono, areaVenta;
    private Cliente[] clientes;
    private final float comision = 0.10f;

    public Vendedor(Coche coche, String telefono, String areaVenta, Cliente... clientes) {
        this.coche = coche;
        this.telefono = telefono;
        this.areaVenta = areaVenta;
        this.clientes = clientes;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;

    }


    public Cliente[] deleteCliente(Vendedor v) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("pon dni a buscar");
        String DNI = sc.next();
        do {
            if (clientes[i].getDNI().equals(DNI)){
                clientes[i]=null;
                ordenarCliente();
                return clientes;// el return de salir
            }
            i++;
        } while ( i < clientes.length); // nunca =< se sale de length
        System.out.println("no encontrado");
        return clientes;
    }
    public Cliente[] ordenarCliente() {
        Cliente[] aux = new Cliente[clientes.length];
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i]!=null){
                aux[i] = clientes[i];
            }
        }

        clientes = aux;
        return clientes;
    }
    public Cliente[] addCliente() {
        Cliente[] aux = new Cliente[clientes.length + 1];
        for (int i = 0; i < clientes.length; i++) {
            aux[i] = clientes[i];
            if (i == clientes.length - 1) {
                aux[i] = createCliente();
            }

        }

        clientes = aux;
        return clientes;
    }


    public Cliente createCliente() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, DNI, direcc, tfn, fecha;
        System.out.println("pon nombre");
        nombre = sc.next();
        System.out.println("pon apellido");
        apellido = sc.next();
        System.out.println("pon DNI");
        DNI = sc.next();
        System.out.println("pon direcc");
        direcc = sc.next();
        System.out.println("pon tfn");
        tfn = sc.next();
        System.out.println("pon fecha");
        fecha = sc.next();


        Cliente c = new Cliente(nombre, apellido, DNI, direcc, tfn, fecha);


        return c;
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
