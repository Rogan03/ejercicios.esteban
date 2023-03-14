/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*      *
*      *
* * * *

 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio8PracticaDia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la longitud de los lados.");
        Scanner leer = new Scanner(System.in);
        int longitud = leer.nextInt();
        for (int i = 0; i < longitud; i++) { //TECHO
            System.out.print("*");            
        }
        System.out.println(" ");
        
        for (int i = 0; i < longitud-2; i++) { //PAREDES
            System.out.print("*");
            for (int j = 0; j < longitud-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for (int n = 0; n < longitud; n++) { //PISO
                System.out.print("*"); 
            }
                    
        System.out.println(" ");
    }
    
}
