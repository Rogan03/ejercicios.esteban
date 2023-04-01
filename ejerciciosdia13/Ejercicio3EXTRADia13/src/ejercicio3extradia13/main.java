/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extradia13;

import entidades.Juego;

/**
 *
 * @author ESTEBAN
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego prueba = new Juego();
        do {
            prueba.iniciar_juego();
            prueba.otra_vez();
        } while ("Y".equals(prueba.si()));

    }

}
