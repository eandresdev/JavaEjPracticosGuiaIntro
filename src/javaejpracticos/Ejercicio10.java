package javaejpracticos;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        /* ejercicio 10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
            números al usuario hasta que la suma de los números introducidos supere el límite inicial.  */

        //inicializamos el scanner
        Scanner scan = new Scanner(System.in);
        //variables
        int num;
        int num2;
        int suma = 0;

        System.out.println("Hola, ingresa un número limite: ");
        do
        {
            num = scan.nextInt();
            if (num < 0 || num == 0)
            {
                System.out.println("El número ingresado es un  número negativo o es cero, ingresa otro número...");
            } else
            {
                System.out.println("Tu limite es " + num);
            }
        } while (num < 0 || num == 0); // aqui termina la validacion de solo numeros positivos.

        System.out.println("Ingresa un número hasta alcanzar el limite ");

        while (suma < num)
        {
            System.out.println("Ingresa un número...");
            num2 = scan.nextInt();
            suma += num2;
        }// iteracion mientras suma no supere el limite.

        if (suma == num)
        {
            System.out.println("Llegaste al limite " + suma);

        } else
        {
            System.out.println("Wow!! pasaste el limite, llegaste a " + suma);

        }

    }

}
