/*
Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 
*/
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio5PracticaDia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        int num;
        System.out.println("Ingrese un número máximo.");
        Scanner leer = new Scanner(System.in);
        int maximo = leer.nextInt();
        if (maximo>0) {
            do {
            System.out.println("Ingresa un número.");
            num = leer.nextInt();
            contador = contador + num;
        } while (contador < maximo);
            System.out.println(contador);
        } else {
            System.out.println("Solo máximos positivos."); 
        }
        
    }
    
}
