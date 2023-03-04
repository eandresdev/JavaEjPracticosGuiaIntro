package javaejpracticos;

// se importa la libreria Scanner ademas de otras librerias para interactuar
import java.util.*;

public class Ejercicio12 {

    public static void main(String[] args) {
        /* Ejercicio 12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
            dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
            fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
            X y el último tiene que ser una O.
            Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
            especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
            de FDE, que no respete el formato se considera incorrecta.
            Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
            incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
            siguientes funciones de Java Substring(), Length(), equals().*/

        // se declara,instancia o incializa la libreria scanner 
        Scanner scan = new Scanner(System.in);// scan = a una nueva instancia de la libreria scanner(System.in=nueva entrada de datos)
        //declaro variables
        int correctas = 0;
        int incorrectas = 0;
        String secuencia;
        String letra1;
        String letra2;

        do
        {
            System.out.println("***Ingresa una secuencia : ***");
            secuencia = scan.next();
            if (secuencia.length() == 5)
            {
                letra1 = secuencia.substring(0, 1);
                letra2 = secuencia.substring(4, 5);

                if (secuencia.equals("&&&&&"))
                {
                    System.out.println(" Se finaliza el programa por peticion del usuario");
                    System.out.println("Usted ingreso " + correctas + " secuencias correctas. ");
                    System.out.println("Usted ingreso " + incorrectas + " secuencias incorrectas. ");

                    break;
                }// condicional de salida

                if (secuencia.length() == 5)
                {
                    if (letra1.equalsIgnoreCase("X") && letra2.equalsIgnoreCase("O"))
                    {
                        correctas++;
                        System.out.println("Secuencia correcta");
                        System.out.println("Recuerde que puede finalizar la secuencia ingresanso '&&&&&'");

                    } else
                    {
                        System.out.println("Secuencia incorrecta, sigue intentando");
                        incorrectas++;

                    }// condicional validacion ingreso correcto + conteo
                } else
                {
                    System.out.println("Error en el formato, la secuencia debe ser de 5 caracteres.");
                    incorrectas++;

                }
            } else
            {
                System.out.println("La secuencia ingresada de estar compuesta por CINCO caracteres, vuelva a intentar...");
                incorrectas++;
            }

        } while (!"&&&&&".equals(secuencia));

    }// fin metodo main

}//fin class
