package ieslavereda;

public class Ejemplo {
    public static void main(String[] args) {
        //Persona p = new Persona("22222222-e","ptt","pll",22);
        //System.out.println(p);
//        for (int i = 0; i < 3; i++) {
//            System.out.println( new Persona("22222222-e","ptt","pll",22+i));
//        }

        Alumno a = new Alumno("sss","ptt","ppl",999,Grado.ASIR);
        Profesor ppt = new Profesor("123","xavi","pp",99,Grado.ASIR,Grado.ASIR2);
        Profesor ppt2 = new Profesor("321","joaquin","pp2",99,Grado.DAM,Grado.DAM2);

        //System.out.println(ppt);
        EqDirectivo p = new EqDirectivo("444","joaq","pp3",99,"modulos informatia",ppt2,ppt);
        System.out.println(p);
    }
}

