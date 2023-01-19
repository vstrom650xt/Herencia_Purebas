package EjersClase.five;

public class Prueba {
    public static void main(String[] args) {
        Secretario p = new Secretario("pp","pttt","123456","avd de casa","132456789",1000,"A1","1111");
      //  p.increSalario();
        Cliente c = new Cliente("dd","dd","dd","dd","gg","12/12/12");
        Cliente c2 = new Cliente("dd","dd","dd","dd","gg","12/12/12");
        Cliente c3 = new Cliente("dd","dd","dd","dd","gg","12/12/12");

        Vendedor v = new Vendedor(new Coche("123","audi","a3"),"123456789","las buenas ventas",c,c2);
    //    v.addCliente();
        System.out.println(v);
        v.deleteCliente(v);
        System.out.println(v);
    }
}
