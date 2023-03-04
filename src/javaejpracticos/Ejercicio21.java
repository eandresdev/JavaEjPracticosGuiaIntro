
package javaejpracticos;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio21 {

  private static Scanner leer = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    public static void main(String[] args) {
        /*21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
              3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
              dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
              se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
              que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
              la matriz M en la cual empieza el primer elemento de la submatriz P.  */
        
        int [][] matrizM = new int[10][10];
        int [][] matrizP = new int[3][3];
        System.out.println("------------------");
        rellenarM(matrizM);
        mostrarM(matrizM);
        rellenarP(matrizP);
        comprobarMatrizP(matrizM,matrizP);
    }//fin main
    
    /*------------------------RELLENAR MATRIZ M---------------------------------*/
    public static void rellenarM(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() *9 +1);// cargo la matriz de 10x10 con valores aleatorios usando el  (int) (Math.random() )
            }
        }
    }
    /*------------------------MOSTRANDO MATRIZ M---------------------------------*/
    public static void mostrarM(int [][] matriz) {
        System.out.println("asi se ve la matriz de 10x10: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d ", matriz[i][j]); //otro formato para imprimir la matriz, el print modifica a printf y se indica
                // en "%d" que los espacios a llenar van a ser cubiertos con valores numericos en las posiciones de la 
                // y le paso matriz [][] .
            }
            System.out.println(" ");
        }
    }
    /*------------------------RELLENAR MATRIZ P--------------------------------*/
    public static void rellenarP(int[][] matriz) {
        System.out.println("Ingrese los valores para la matriz P: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //System.out.print("Posicion ["+i+"],["+j+"] :");
                System.out.printf("Posicion [%d],[%d]: ", i,j);// otro ejemplo para ver en consola, es ma facil la redaccion del print de esta 
                //forma no requiere concatenar tanto, se pasa el valor numerico que espera recibir(en este caso i y j) y listo.
                matriz[i][j]=leer.nextInt();
            }
        }
    }
    
    /*------------------------COMPROBAR MATRIZ--------------------------------*/
    public static void comprobarMatrizP(int[][] matrizM, int[][] matrizP) {
        /* llego hasta el tamaño de la matriz-2(indicando asi que se detenga el recorrido dos 
        posiciones antes de completar el cuadro de 10x10 asi no me salgo del margen ya qie la
        proxima matriz a comparar tiene una dimension de 3x3)*/
        
        int posicionI= 0, posicionJ= 0;
        boolean bandera = false;
        
        for (int i = 0; i < matrizM.length-2; i++) { 
            for (int j = 0; j < matrizM.length-2; j++) {
                
                if (matrizP[0][0] == matrizM[i][j]) {
                    posicionI = i;
                    posicionJ = j;
                    bandera = verificar(matrizM,matrizP,posicionI,posicionJ);
                    
                }
                if (bandera) {
                    break;
                    
                }
            }
            if (bandera) {
                    break;
                    
                }
        }
        if (bandera) {
            System.out.printf("La matriz FUE ENCONTRADA en la poscion [%d],[%d]",posicionI,posicionJ);
        }else{
            System.out.println("La matriz NO fue encontrada");
        }
        
    }
    
    public static boolean verificar(int[][] matrizM,int[][] matrizP,int posicionI,int posicionJ) {
        int filadeP= 0, columnadeP = 0, cont = 0;
        for (int i = posicionI; i < posicionI+3; i++) {
            for (int j = posicionJ; j < posicionJ+3; j++) {
                if (matrizM[i][j] == matrizP[filadeP][columnadeP]) {
                    cont++;
                }
                columnadeP++;
                
            }
            filadeP++;
            columnadeP = 0;
        }
        
        if (cont == 9) {
            return true;
        }else{
            return false;
        }
    
    }
}//fin class
