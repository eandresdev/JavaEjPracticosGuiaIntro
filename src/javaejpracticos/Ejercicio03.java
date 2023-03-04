
package javaejpracticos;

import java.util.Scanner;


public class Ejercicio03 {

    
    public static void main(String[] args) {
        /* Ejercicio 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
            en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java. */
        
        Scanner scan =new Scanner(System.in);
        String frase;
        System.out.println("Ingresa una palabra o frase: ");
        frase = scan.nextLine(); // colocandole solo el next() te toma solo la primer palabra ingresada, con el nextLine te toma la linea completa
        
        System.out.println(frase.toUpperCase());// mayusculas a traves del metodo toUppercase
        System.out.println("----------------------------------");
        System.out.println(frase.toLowerCase());// minisculas a traves del metodo toLowercase
    }
    
}
