// Calificación del estudiante: Pide al usuario su calificación y muestra su nota
//alfanumérica: 'Sobresaliente' (10, 9), 'Notable' (8, 7), 'Bien' (6), 'Aprobado' (5),
//'Insuficiente' (4, 3), 'Muy deficiente' (2, 1, 0)

package actividad1_1_lista_ejercicios;
import java.util.Scanner;

// NOTA: El switch no funciona con valores decimales.
public class Ejercicio1_4_switch {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce su calificación: ");

        int calificacion = leer.nextInt();

        switch (calificacion) {
            case 10,9 -> System.out.print("Sobresaliente");
            case 8,7 -> System.out.print("Notable");
            case 6 -> System.out.print("Bien");
            case 5 -> System.out.print("Aprobado");
            case 4,3 -> System.out.print("Insuficiente");
            case 2,1, 0 -> System.out.print("Muy deficiente");

        }
    }
}