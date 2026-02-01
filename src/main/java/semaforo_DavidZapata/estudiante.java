package semaforo_DavidZapata;

import principal.ordenador;

public class estudiante extends persona{
    int Curso;

    public estudiante() {
        Edad=25;
        Nombre = "Luis";
        Curso = 1;
    }
    public void presentarse(){
        System.out.println("Soy " + Nombre + " Alumno de " + Curso
                + "º y tengo una edad de: " + Edad);
    }
    public String preguntacolor(){
        presentarse();
        ordenador mipc = new ordenador();
        return mipc.color();
    }
}
