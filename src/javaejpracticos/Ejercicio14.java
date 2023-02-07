
package javaejpracticos;

// se importa librerias para interactuar
import java.util.*;

public class Ejercicio14 {

   
    public static void main(String[] args) {
        /* Ejercicio 14. Crea una aplicación que a través de una función nos convierta una cantidad de euros 
            introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
            función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
            una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
            (void).
            El cambio de divisas es:
             * 0.86 libras es un 1 €
             * 1.28611 $ es un 1 € 
             * 129.852 yenes es un 1 €*/
        
        
        // Inicializo scanner
        Scanner scan = new Scanner(System.in);
        //variables
        double euros;
        String monedaCambio;
        
        //interaccion con ususario
        System.out.println("Hola, ingresa la cantidad de euros que deseas cambiar:  (POR FAVOR RECUERDE INGRESAR LOS DECIMALES COMPLETOS)");
        euros=scan.nextDouble();
        System.out.println("Por favor indicanos a cuál de estas divisas te gustaria cambiar: Dólar,Yenes o Libras Esterlinas");
        monedaCambio=scan.next();
        
        //llamado a funcion
        conversion(euros,monedaCambio);
       
    }// fin metodo main
    
    
    //inicio funcion void conversion
    public static void conversion(double num, String aCambiar){
        // declaro variables para la funcion
        double covirtiendo= 0.0;
        
        //la segunda varible la usa el switch como condicion 
        switch (aCambiar){// según aCambiar sea igual a algunos de los casos, pues hará el proceso correspondiente.
            case "dolar":
                
                System.out.println("El precio de cambio es 1.28611 ");
                covirtiendo = num * 1.28611;
                System.out.println("Su total en dolares es de US$ " + covirtiendo );
                break;
                
            case "yenes":
                
                System.out.println("El precio de cambio es 129.852 ");
                covirtiendo = num * 129.852;
                System.out.println("Su total en Yenes es de ¥$ " + covirtiendo );
                break;
                
            case "libras":
                
                System.out.println("El precio de cambio es 1.28611 ");
                covirtiendo = num * 0.86;
                System.out.println("Su total en Libras es de £$ " + covirtiendo );
                break;
                
            default:
                System.out.println("Error! datos mal ingresados por favor reinicie el programa");
        }

    }//fin funcion conversion()
    
} // fin class
        
    