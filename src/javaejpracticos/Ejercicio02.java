
package javaejpracticos;

import java.util.Scanner;
public class Ejercicio02 {

    
    public static void main(String[] args) {
        // Ejercicio 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        
        Scanner scan = new Scanner(System.in);
        String nombre;
        
        System.out.println("Escribe tu nombre: ");
        nombre=scan.next();
        System.out.println("Hola "+nombre);
        
    }
    
}
