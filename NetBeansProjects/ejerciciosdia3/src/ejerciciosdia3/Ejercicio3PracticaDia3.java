package ejerciciosdia3;


import java.util.Scanner;

/*
Realizar un programa que solo permita introducir frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio3PracticaDia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase o palabra.");
        Scanner leer = new Scanner(System.in);
        String palabra = leer.nextLine();
        if (palabra.length()==8){
            System.out.println("Correcto.");
        }
        else {
            System.out.println("Incorrecto.");
        }
    }
    
}
