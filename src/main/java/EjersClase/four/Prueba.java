package EjersClase.four;

public class Prueba {
    public static void main(String[] args) {
        Refrigerado q = new Refrigerado(32123321,"02-02-202",14789);
        Fresco f = new Fresco(32123321,"02-02-2024","españa","10-10-2023");
        Congelado c = new Congelado(32123321,"02-02-202",14789);

        System.out.println(q);
        System.out.println(f);
        System.out.println(c);

    }
}
