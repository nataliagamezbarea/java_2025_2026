// Calificación del estudiante: Pide al usuario su calificación y muestra su nota
//alfanumérica: 'Sobresaliente' (10, 9), 'Notable' (8, 7), 'Bien' (6), 'Aprobado' (5),
//'Insuficiente' (4, 3), 'Muy deficiente' (2, 1, 0)

package actividad1_1_lista_ejercicios;
import java.util.Scanner;

public class Ejercicio1_4_if_else {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce una calificacion: ");

        float calificacion = leer.nextFloat();

        if (calificacion <= 10 && calificacion >= 9) {
            System.out.print("Sobresaliente");
        } else if (calificacion < 9 && calificacion >= 7) {
            System.out.print("Notable");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.print("Bien");
        } else if (calificacion >= 5 && calificacion < 6) {
            System.out.print("Aprobado");
        } else if (calificacion >= 3 && calificacion <5 ) {
            System.out.print("Insuficiente");
        } else if(calificacion < 3 && calificacion >=0)  {
            System.out.print("Muy deficiente");
        } else {
            System.out.print("Introduzca una nota entre 0 y 10");
        }
    }
}