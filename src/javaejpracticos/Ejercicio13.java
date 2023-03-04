package javaejpracticos;

//se importan librerias para interactuar
import java.util.*;

public class Ejercicio13 {

    public static void main(String[] args) {
        /* Ejercicio 13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
            cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
            * * * *
            *     *
            *     *
            * * * *      */

        //inicializamos Scanner para permitir una nueva entrada de datos
        Scanner scan = new Scanner(System.in);

        //declaro variables
        int num;
        String respuesta;

        // se agrega bucle dowhile para hacer mas dinamico el ejercicio.
        do
        {
            System.out.println("Ingresa una medida para tu cuadrado: ");
            num = scan.nextInt();// se lee la medida

            //inicia for para armar el cuadrado
            for (int i = 0; i <= num - 1; i++)
            { // si inicializa variable en 0 hasta num-1

                for (int j = 0; j <= num - 1; j++)
                { // si inicializa variable en 0 hasta num-1
                    if ((j == 0 || j == num - 1) || (i == 0 || i == num - 1))
                    { // si j o i son = 0 o num-1 entonces muestrame asterisco, si no espacio en  blanco
                        System.out.print("* ");
                    } else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println("  ");

            }

            System.out.println("Te gustaria hacer otro cuadrado ? S = si /N = no");
            respuesta = scan.next();
        } while (respuesta.equalsIgnoreCase("s")); // dowhile finalizado una vez  lee "n" como respuesta 

    }// fin metodo main

}// fin class
