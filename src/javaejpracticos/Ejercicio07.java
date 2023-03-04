package javaejpracticos;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        /* Ejercicio 7.  Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
            pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
            la función equals() en Java.  */
        Scanner scan = new Scanner(System.in);
        String frase1 = "eureka";
        String frase2;

        System.out.println("Encuentra la palabra secreta!!! ");
        do
        {

            frase2 = scan.nextLine();
            if (frase1.equals(frase2))
            {
                System.out.println("CORRECTOOO");

            } else
            {
                System.out.println("INCORRECTOOO");
                System.out.println("Seguí intentando...");
            }

        } while (!"eureka".equals(frase2)); // agrego el dowhile para que permita intentos x error,  ejemplo de como negar el equals().
    }

}
