
package javaejpracticos;

// importamos Scanner
import java.util.Scanner;

public class Ejercicio08 {

    
    public static void main(String[] args) {
        /* Ejercicio 8.Realizar un programa que  permita introducir solo frases o palabras de 8 de largo. Si el
                       usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
                       pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
                       Nota: investigar la función Lenght() en Java.   */
        
        //inicializamos el scanner
        Scanner scan = new Scanner(System.in);
        
        // variables
        String frase;
        int longitud;
        
        System.out.println("Hola, ingrese una palabra o frase: ");
        
        do{            
            frase=scan.nextLine();
            longitud=frase.length();
            if (longitud == 8) {
                System.out.println("Correcto");
                     
                
            }else if (longitud > 8) {
                System.out.println("Incorrecto");
                
                
            }else {
                System.out.println("Ingresa otra palabra: ");
                
            }
            
        } while (longitud < 8 ); // mientras la longitud de la frase sea menor a 8 la va a solicitar nuevamente, de otra forma saldra del bucle.
    }
}