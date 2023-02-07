
package javaejpracticos;

//imports liv¿breiras para interactuar
import java.util.Scanner;


public class Ejercicio18 {

    
    public static void main(String[] args) {
        /*18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
              traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
              cambiando sus filas por columnas (o viceversa).  */
        
        Scanner leer = new Scanner(System.in); // inicializo Scanner para entrada de datos
        
        // declaro matriz con su tamaño
        int matriz[][] = new int[3][3]; 
        
        
        //matriz original
        System.out.println("\nRellenando la matriz :");
        for(int i = 0; i < matriz.length; i++){// i recorre las filas
            for (int j = 0; j < matriz.length; j++){//j recorre las columnas
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz [i][j] = leer.nextInt(); // rellena matriz manualmente
  
            }
        }
        System.out.println("\n la matriz se ve así: ");//muestro matriz llena
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        //matriz transpuesta
        int aux;// uso var auxiliar
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < i;j++){ // j<i porque nosotros vamos a sacar la la matriz transpuesta desde la diagonal principal hacia abajo 
                 aux = matriz[i][j];
                 matriz[i][j]= matriz[j][i];
                 matriz [j][i] = aux;
            }      
        }
        
        System.out.println("\n La matriz transpuesta se ve así: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }// fin metodo 
    
}// fin class
