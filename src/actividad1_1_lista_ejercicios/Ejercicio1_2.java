// 2. Verificar número par/impar: Solicita al usuario ingresar un número e indica si es par o
//impar.
package  actividad1_1_lista_ejercicios;
import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = leer.nextInt();

        if (numero % 2 == 0) {
            System.out.print("El número " + numero  + " es par");
        } else if (numero % 2 == 1) {
            System.out.print("El número " + numero + " es impar");
        } else {
            System.out.print("El número es 0 y no es divisible");
        }
    }
}