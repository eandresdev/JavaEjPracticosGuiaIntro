
package javaejpracticos;

import java.util.Scanner;

public class Ejercicio05 {

    
    public static void main(String[] args) {
        /* Ejercicio 5.  Escribir un programa que lea un número entero por teclado y muestre por pantalla el
            doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Hola, por favor ingresa un número: ");
        num= scan.nextInt();
        
        System.out.println("El doble de tu número es: "+ num*2);
        System.out.println("El triple de tu número es: "+ num*3);
        System.out.println("La raiz cuadrada de tu número es: "+ Math.sqrt(num)); // Math.sqrt(num) retorna la raiz cuadrada de un numero.
        
    }
}
