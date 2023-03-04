package javaejpracticos;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        /* Ejercicio 9.  Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
            es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
            diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
            la función Substring y equals() de Java.    */

        //inicializamos el scanner
        Scanner scan = new Scanner(System.in);

        //variables
        String var1 = "A";

        String var2;
        String frase;

        System.out.println("Hola, ingresa una palabra: ");
        frase = scan.nextLine();
        var2 = frase.substring(0, 1); // para leer el primer caracter no es de 0,0 sino de 0,1.
        System.out.println(var2);

        if (var1.equals(var2))
        {
            System.out.println("Correcto");

        } else
        {
            System.out.println("Incorrecto");

        }
    }

}
