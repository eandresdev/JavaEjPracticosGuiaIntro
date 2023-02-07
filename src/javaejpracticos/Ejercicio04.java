
package javaejpracticos;

import java.util.Scanner;

public class Ejercicio04 {

   
    public static void main(String[] args) {
        /* Ejercicio 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
            Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */
        
        Scanner scan= new Scanner(System.in);
        int gradosCen;
        int gradosFar;
        System.out.println("Ingresa el número de grados centigrados a convertir: ");
        gradosCen = scan.nextInt();
        gradosFar =32 + (9 * gradosCen / 5);
        
        System.out.println(gradosCen+ " C° equivale a "+gradosFar+" F°.");
    }
    
}
