// MAIN
package javaejpracticos;

// importamos librerias para interactuar
import java.util.*;

public class Ejercicio16 {

    public static void main(String[] args) {
        /*16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
              usuario un número a buscar en el vector. El programa mostrará donde se encuentra el
              número y si se encuentra repetido.
         */

        // inicializamos un Scanner 
        Scanner scan = new Scanner(System.in);

        //variables
        int num;
        int acumulador = 0;

        //bloque solución
        System.out.println("Hola, de que tamaño quieres que sea el vector? ");
        int vector[] = new int[scan.nextInt()];//declaro vector, tamaño lo asigna el usuario
        System.out.println("Escoge un número del 1 al 10 y no olvides decirnos cúal es ");
        num = scan.nextInt();
           System.out.println("---------------------------------------------------------");
        
        for (int i = 0; i < vector.length; i++) { //for para rellenar el vector y hacer las comprobaciones
            
            vector[i] = (int) (Math.random() * 10 + 1); // genera o devuelve un número aleatorio del 1 al 10
            //System.out.println("el numero aleatorio es " + vector[i] + " y esta en la posicion " + i); (este sout es para comprobar la posición de cada número

            if (num == vector[i]) {// si el numero es igual al aleatorio en la posicion i, acumulo 1.

                acumulador += 1;
                
                System.out.println("Encontre el número " + num + " en la posición " + i);
            } else {

                System.out.println("Espere estamos buscando...");
            }
        }
        System.out.println("Encontre el número " + num + " repetido " + acumulador + " veces");

    }// fin main

} // fin clase
