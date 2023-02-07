
package javaejpracticos;



public class Ejercicio15 {

    public static void main(String[] args) {
        /* Ejercicio 15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
            muestre por pantalla en orden descendente.  */
        
        
        
        //variables y vectores
        int[] arreglo = new int[100];
        
         for (int i = 0; i < arreglo.length; i++){// este bucle llena el vector de 1 a 100
             arreglo[i]= i; 
             //System.out.print(arreglo[i] + " ");
         }
         
         
         System.out.println("El siguiente Vector le mostrara un conteo de 100 a 0 ");
         System.out.print("[");
         for (int i = arreglo.length ; i > 0; i--) { //este loop muestra el conteo por pantalla de 100 a 0
             
             System.out.print( i+ " ");
        }
        System.out.println("]");
    }// fin metodo main
    
}// fin class
