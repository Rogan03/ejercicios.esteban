/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio7PracticaDia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = " ";
        int contPos = 0;
        int contNeg= 0;
        do {
            System.out.println("Ingrese una cadena.");
            Scanner leer = new Scanner(System.in);
            cadena = leer.next();
            int longitud=cadena.length();
            if (cadena.substring(0,1).equalsIgnoreCase("X")) {
                if (cadena.substring(4).equalsIgnoreCase("O")) {
                    contPos = contPos + 1;
                    }
                }
            else{
                contNeg = contNeg + 1;
            }
        } while (cadena.equals("&&&&&"));
        System.out.println("La cantidad de entradas positivas es:" + contPos);
        System.out.println("La cantidad de entradas negativas es:" + contNeg);
        
    }
    
}
