package Ejercicio1;

public class Main{
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Diomedes", 34, 4.5);

        System.out.println("El estudiante #1 es = " + estudiante1.getNombre());
        System.out.println("Su edad es = " + estudiante1.getEdad());
        System.out.println("Su nota promedio es de = " + estudiante1.getNotaPromedio());



    }

}
