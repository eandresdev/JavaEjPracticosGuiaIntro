package javaejpracticos;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        /* Ejercicio 6. Crear un programa que dado un numero determine si es par o impar.*/
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Hola, ingresa un número: ");
        num = scan.nextInt();

        if (num % 2 == 0)
        { // num MOD 2 = resto 0
            System.out.println("El número que ingresaste es PAR ");

        } else
        {
            System.out.println("El número que ingresaste es IMPAR ");

        }
    }

}
