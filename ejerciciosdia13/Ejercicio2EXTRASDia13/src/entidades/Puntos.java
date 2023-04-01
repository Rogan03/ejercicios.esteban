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
public class Puntos {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la posición X e Y del PUNTO 1.");
        x1 = leer.nextInt();
        y1 = leer.nextInt();
        System.out.println("Ingrese la posición X e Y del PUNTO 2.");
        x2 = leer.nextInt();
        y2 = leer.nextInt();
    }
    
    public double distancia() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
            
}
