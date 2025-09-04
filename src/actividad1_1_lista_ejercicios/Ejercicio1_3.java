// 3. Calificación del estudiante: Pide al usuario su calificación y muestra si ha aprobado (calificación mayor o igual a 5) o suspendido.

package actividad1_1_lista_ejercicios;
import java.util.Scanner;
public class Ejercicio1_3 {
    public static void main (String[] args) {
        System.out.print("Introduce tu calificación: ");
        Scanner leer = new Scanner(System.in);
        float calificacion = leer.nextFloat();
        if (calificacion >=5) {
            System.out.print("La calificación está aprobada");
        } else {
            System.out.print("La calificación esta suspendida");
        }

    }
}
