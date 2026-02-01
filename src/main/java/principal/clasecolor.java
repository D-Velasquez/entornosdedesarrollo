package principal;

import semaforo_DavidZapata.prf;

public class clasecolor {

    public static final String PRIMER_PARÁMETRO = "Primer parámetro";

    public static void main(String[] args) {
        prf teacher = new prf();
        String color = teacher.preguntacolor();
        final var mensaje = "La respuesta recibida es:";
        System.out.println(mensaje + color);
    }
    public static void CambSig(int iPUno, int iPDos){
        System.out.println(PRIMER_PARÁMETRO + iPUno);
        System.out.println("Segundo parámetro" + iPDos);
    }
}
