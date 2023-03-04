package javaejpracticos;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        /* Ejercicio 11.  Realizar un programa que pida dos números enteros positivos por teclado y muestre por
            pantalla el siguiente menú: 
                            MENU
                            1. Sumar
                            2. Restar
                            3. Multiplicar
                            4. Dividir
                            5. Salir
                            Elija opción:
            El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
            y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
            Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
            directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
            desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
            programa, caso contrario se vuelve a mostrar el menú.*/

        // incializamos scanner
        Scanner scan = new Scanner(System.in);
        //variables
        int num1;
        int num2;
        int opcion;
        String salida = "";

        System.out.println("Hola, bienvenido a tu calculadora, recuerda escoger una opcion para operar...");
        //inicializa el bucle
        do
        {
            // ingreso de variables
            System.out.println("Ingresa el primer número");
            num1 = scan.nextInt();
            System.out.println("Ingresa el segundo número");
            num2 = scan.nextInt();
            //inicia menu
            System.out.println("Que operación deseas realizar? ");
            System.out.println(" MENU: ");
            System.out.println(" 1. Sumar ");
            System.out.println(" 2. Restar ");
            System.out.println(" 3. Multiplicar ");
            System.out.println(" 4. Dividir ");
            System.out.println(" 5. Salir");
            System.out.println(" Elija una opción: ");
            opcion = scan.nextInt();

            switch (opcion)
            {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    if (opcion == 5)
                    {
                        System.out.println("¿Está seguro que desea salir del programa (S/N)? ");
                        salida = scan.next();
                        break;
                    }
            }
        } while (salida.equalsIgnoreCase("N")); // hasta que salida sea igual a "N".
    }
}
