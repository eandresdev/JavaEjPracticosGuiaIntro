
package javaejpracticos;

//importamos el scanner
import java.util.Scanner;

public class Ejercicio01 {

  
    public static void main(String[] args) {
        /* Ejercicio 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
        El programa deberá después mostrar el resultado de la suma. */
        
        Scanner scan = new Scanner(System.in);// inicializamos el scanner
        int num1;
        int num2;
        
        
        System.out.println("Hola,  si me dices dos números enteros, te dire cuanto suman... ");
        System.out.println("Cuál es el primer número? ");
            num1 = scan.nextInt(); //se lee por teclado la primer variable
        System.out.println("Cuál es el segundo número? ");
            num2 = scan.nextInt(); // se lee por teclado la segunda variable
            
        int suma = num1 + num2; // se suman los datos ingresados 
        System.out.println("El total es de " + suma); // se entrega el resultado al usuario
        
    }
    
}
