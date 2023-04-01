/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Juego {

    Scanner leer = new Scanner(System.in);
    private int intentos;
    private int victoria1;
    private int victoria2;

    public Juego() {
    }

    public Juego(int intentos, int victoria1, int victoria2) {
        this.intentos = intentos;
        this.victoria1 = victoria1;
        this.victoria2 = victoria2;
    }

    public void iniciar_juego() {
        intentos=1;
        int check;
        System.out.println("Ingrese el nombre del JUGADOR 1.");
        String jugador1 = leer.next();
        System.out.println("Ingrese el nombre del JUGADOR 2.");
        String jugador2 = leer.next();
        System.out.println("--------------------");
        System.out.println(jugador1 + " deberá ingresar el número a buscar.");
        int numFind = leer.nextInt();
        System.out.println(jugador2 + " tendrás 5 intentos a partir de ahora, empieza.");
        do {
            check = leer.nextInt();
            System.out.println("Llevas " + intentos++);
            if (check == numFind) {
                System.out.println(jugador2 + " ADIVINÓ EL NÚMERO.");
                victoria2++;
                break;
            } else if (check > numFind) {
                System.out.println("Más bajo.");
            } else if (check < numFind) {
                System.out.println("Más alto.");
            }
            if (intentos==6) {
                System.out.println("PERDISTE, SE TE ACABARON LOS INTENTOS.");
                System.out.println("EL NÚMERO A ENCONTRAR ERA: " + numFind);
                victoria1++;
            }
        } while ((check != numFind) && (intentos <= 5));
    }

    public void otra_vez() {
        System.out.println("¿DESEA VOLVER A JUGAR? (Y/N)");
    }

    public String si() {
        String resp = leer.next();
        if ((!"Y".equals(resp)) || (!"N".equals(resp))) {
            System.out.println("OPCIONES INVÁLIDAS.");
        }
        return resp;
    }

}
