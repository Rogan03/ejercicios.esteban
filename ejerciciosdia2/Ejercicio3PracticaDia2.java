/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejerciciosdia2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio3PracticaDia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  	     System.out.println("Escribe una frase.");
             Scanner leer = new Scanner(System.in);
             String frase = leer.nextLine();
             System.out.println("La frase en mayúsculas y minúsculas es es: " + toUpperCase(frase) + " " + toLowerCase(frase));
           
 }	
}
        
   


    
