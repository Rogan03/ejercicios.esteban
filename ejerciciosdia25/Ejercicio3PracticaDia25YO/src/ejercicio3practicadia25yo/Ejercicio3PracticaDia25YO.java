/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3practicadia25yo;

import servicio.ArreglosService;

/**
 *
 * @author Esteban
 */
public class Ejercicio3PracticaDia25YO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arreglo1 = new double[50];
        double[] arreglo2 = new double[20];
        ArreglosService as = new ArreglosService();
        as.inicializarA(arreglo1);
        as.mostrar(arreglo1);
        System.out.println("----------");
        as.ordenar(arreglo1);
        as.inicializarB(arreglo1, arreglo2);
        System.out.println("----------");
        as.mostrar(arreglo2);
    }

}
