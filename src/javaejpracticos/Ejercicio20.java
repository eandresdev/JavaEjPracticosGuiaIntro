package javaejpracticos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio20 {

    //declaro Scanner de manera global
    private static Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public static void main(String[] args) {
        /*20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
              suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
              permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
              El programa deberá comprobar que los números introducidos son correctos, es decir,
              están entre el 1 y el 9. */

        //declaro matriz y solicito tamañoal usuario 
        int[][] matriz = new int[3][3];

        //llamados de funciones 
        rellenarMatriz(matriz);
        System.out.println("----------------------");
        mostrarMatriz(matriz);
        System.out.println("----------------------");
        cuadradoMagico(matriz);
        
    }//fin main

    
    /*---------------------FUNCION RELLENAR MATRIZ----------------------*/
    public static void rellenarMatriz(int[][] matriz) {
        int num;
        System.out.println("Ingrese los valores para rellenar la matriz de 3 x 3 con números del 1 al 9: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //cargo matriz manualmente y compruebo el ingreso de numeros del 1 al 9.
                System.out.print("Matriz en la posición [" + i + "," + j + "]: ");
                num = leer.nextInt();
                if (num > 0 && num < 10) {
                    matriz[i][j] = num;

                } else {
                    do {
                        System.out.println("El número ingresado supera el limite requerido, por favor ingreselo nuevamente");
                        System.out.print("Matriz en la posición [" + i + "," + j + "]: ");
                        num = leer.nextInt();
                        
                    } while (num < 0 && num > 10);
                    matriz[i][j] = num;
                }
            }
        }
    }

    /*---------------------FUNCION MOSTRAR MATRIZ-----------------------------*/
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("La matriz cargada se ve así: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    
    /*---------------------FUNCION COMPROBAR SI ES MAGICO-----------------------------*/
    public static void cuadradoMagico(int[][] matriz){
        boolean bandera = false;
        int ref = 0;
        int suma = 0;
        int diagonalP = 0;
        int diagonalS = 0;
        int cont = 0;
        
        
        //valor referencia tomando la sumatoria de la primer fila 
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matriz.length; j++) {
                ref+= matriz[i][j];
            }
        }
        //suma filas
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz.length; j++) {
              suma+= matriz[i][j];
                if (ref == suma) {
                    cont++;
                }
            }
        }
        
        //suma columnas
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz.length; j++) {
                suma+= matriz[j][i];
                if (ref == suma) {
                    cont++;
                }
            }
        }
        
        //diagonalPrincipal
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    diagonalP+= matriz[i][j];
                    
                } 
            }
        }
        if (diagonalP == ref) {
            cont++;
        }
        
        //diagonalSecundaria
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if ((matriz.length-1)-j==i) {
                    diagonalS+= matriz[i][j];
                }
            }
        }
        if (diagonalS == ref) {
            cont++;
        }
       
        //comparo y guardo en bandera 
        if ((cont==2*matriz.length+2)) {
            bandera = true;
        }
         if (bandera ==  true){
             System.out.print("La matriz que ingresastes es MAGICA y la suma fue "+ ref +".");
        }else{
             System.out.print("Lo siento pero la matriz NO es magica. ");
        
        }
        
    }
    
}// fin class
