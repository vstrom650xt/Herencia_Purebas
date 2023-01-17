package ieslavereda;

public class Ejemplo {
    public static void main(String[] args) {
        //Persona p = new Persona("22222222-e","ptt","pll",22);
        //System.out.println(p);
//        for (int i = 0; i < 3; i++) {
//            System.out.println( new Persona("22222222-e","ptt","pll",22+i));
//        }

        Alumno a = new Alumno("sss","ptt","ppl",999,Grado.ASIR);

        Profesor ppt = new Profesor("sss","xavi","pp",99,Grado.ASIR,Grado.ASIR2);

        Profesor ppt2 = new Profesor("sss","joaq","pp",99,Grado.ASIR,Grado.ASIR2);

        System.out.println(ppt);
        EqDirectivo p = new EqDirectivo("sss","joaq","pp",99,ppt2,ppt);
    }
}

