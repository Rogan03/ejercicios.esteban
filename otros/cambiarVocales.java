/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class cambiarVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = leer.nextLine().toUpperCase();
        String retorno = intercambio(frase);
        System.out.print(retorno);
        System.out.println(" ");
    }

    public static String intercambio(String frase) {
        int largo = frase.length();
        String fraseNueva = "";
        for (int i = 0; i < largo; i++) {
            char letra = frase.charAt(i);
            if (letra == 'A') {
                fraseNueva += "@";
            } else if (letra == 'E') {
                fraseNueva += "#";
            } else if (letra == 'I') {
                fraseNueva += "$";
            } else if (letra == 'O') {
                fraseNueva += "%";
            } else if (letra == 'U') {
                fraseNueva += "*";
            } else {
                fraseNueva += letra;
            }
        }
        System.out.println("");
        return fraseNueva;

    }
}
