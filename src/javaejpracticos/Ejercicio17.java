
package javaejpracticos;

// importar scanner
import java.util.Scanner;

public class Ejercicio17 {

    
    public static void main(String[] args) {
        /* 17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
               de 2 dígitos, etcétera (hasta 5 dígitos).
        
        */
        
        //inicializo scanner
        Scanner scan = new Scanner(System.in);
        
        //variables
         int unDigito=0;
         int dosDigitos=0;
         int tresDigitos=0;
         int cuatroDigitos=0;
         int cincoDigitos=0;
         int masDeCinco=0;
        
        //interaccion con usuario
        System.out.print("\nIngrese el tamaño del vector: ");
        int vector[] = new int[scan.nextInt()];// creo vector según usuario
        System.out.println("\nEstamos llenando el vector con números aleatorios... ");
        
        for (int i = 0; i < vector.length; i++){ // lleno el vector con números aleatorios
             vector[i] = (int) (Math.random() * 100000 + 1); // funcion (int) (Math.random()* n) genera numero aleatorio
             
             //System.out.println(vector[i]); // comprobar el vector
             
              if (vector[i] < 10 ) {
                  unDigito++;
                  
              }else if (vector[i]< 100) {
                dosDigitos++;
              
              }else if (vector[i] < 1000) {
                  tresDigitos++;
                  
              }else if (vector[i] < 10000) {
                  cuatroDigitos++;
                  
              }else if (vector[i] < 100000) {
                  cincoDigitos++;
              
              }else {
                  masDeCinco++;
              }
              
              
              
        }// fin for
         
        System.out.println(" El vector esta conformado por: \n"
                +unDigito+ " números de un digito \n"
                +dosDigitos+ " números de dos digitos \n"
                +tresDigitos+ " números de tres digitos \n"
                +cuatroDigitos+ " números de cuatro digitos \n"
                +cincoDigitos+ " números de cinco digitos \n"
                +masDeCinco+ " números de seis o más digitos \n");
        
        
    }// fin main
    
}// fin class
