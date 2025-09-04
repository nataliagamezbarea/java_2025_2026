// 1 . Mayor de dos números: Pide al usuario ingresar dos números y muestra cuál de ellos es mayor.
package actividad1_1_lista_ejercicios;
import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int numero1 , numero2;
        numero1 = leer.nextInt();
        System.out.print("Introduce el segundo número: ");
        numero2= leer.nextInt();

        if (numero1 > numero2) {
            System.out.print("El número mayor es: " + numero1);
        } else if (numero2> numero1) {
            System.out.print("El número mayor es: " + numero2);
        } else {
            System.out.print("No hay ningún número mayor los dos son iguales");
        }

    }
}
