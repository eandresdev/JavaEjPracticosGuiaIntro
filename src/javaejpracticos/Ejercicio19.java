
package javaejpracticos;

//imports
import java.util.Locale;
import java.util.Scanner;


public class Ejercicio19 {

    
    private static Scanner leer = new Scanner(System.in , "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    /* TIP: colocado el Scanner de esta forma de esta forma se comportará de manera global, no teniendo que declalarlo asi cada vez que vayamos
    a usarlo dentro de una funcion */
    public static void main(String[] args) {
        /*19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
              matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
              signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
              denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).  */
        
        
        //declaro matriz con su tamaño
        System.out.println("Hola, por favor ingresa la dimensión de la matriz: ");
        int val1=leer.nextInt();//varible que aloja la dimension de la matriz de esa forma es exacta.
        while (val1 <= 1) { // este while valida que sea un número positivo mayor a uno.
            System.out.println("La dimensión de la matriz debe ser exacta y mayor a 1, vuelva a ingresar:");
            val1 = leer.nextInt();
        }

        int[][] matriz = new int[val1][val1];
        
        
        cargar(matriz);
        comprobar(matriz);
        mostrarMatriz(matriz);
        
    }// fin metodo main
    
    
    /*-------------------FUNCION RELLENAR MATRIZ------------------*/
    public static void cargar(int [][] matriz){
        //matriz original
        System.out.println("\nRellene la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz [i][j] = leer.nextInt(); //rellena matriz manualmente
            }//j
            
        }//i
    }//funcion cargar
    
    /*-----------------FUNCION COMPROBAR SIMETRIA O ANTISIMETRIA--------------*/
    public static void comprobar(int[][] matriz){
        boolean bandera = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != -matriz[j][i]){
                    bandera = true;/* este if lo que hace es trsnaponer la matriz e ir comprobando en cada posicion si el indice 
                                      es igual a su opuesto, de haber un solo indice que no cumpla la condicion inmediatamente deja 
                                      ser anti simétrica*/   
                }//if
            }//j
        }//i
        if (bandera) {
            System.out.println("La matriz NO es anti simétrica");
        } else {
            System.out.println("La matriz SI es anti simétrica");
        }//if
    
    }//funcion comprobar
    
    /*-----------------FUNCION MOSTRAR MATRIZ Y TRANSPUESTA --------------*/
    public static void mostrarMatriz(int[][] matriz){
        System.out.println("\nLa matriz ORIGINAL quedo así: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }//j
            System.out.println(" ");
        }//i
        
        System.out.println("\nLa matriz TRANSPUESTA quedo así: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]+" ");
            }//j
            System.out.println(" ");
        }//i
    }
    
    
    
}// fin class
