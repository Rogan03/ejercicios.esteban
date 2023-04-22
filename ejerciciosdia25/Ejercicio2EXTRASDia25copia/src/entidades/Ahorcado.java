/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Esteban
 */
public class Ahorcado {
    private int palaLong;
    private String palaFind [] = new String [palaLong];
    private int letraFind;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palaFind, int letraFind, int intentos, int palaLong) {
        this.palaFind = palaFind;
        this.letraFind = letraFind;
        this.intentos = intentos;
        this.palaLong = palaLong;
    }


    public String[] getPalaFind() {
        return palaFind;
    }

    public void setPalaFind(String[] palaFind) {
        this.palaFind = palaFind;
    }

    public int getLetraFind() {
        return letraFind;
    }

    public void setLetraFind(int letraFind) {
        this.letraFind = letraFind;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getPalaLong() {
        return palaLong;
    }

    public void setPalaLong(int palaLong) {
        this.palaLong = palaLong;
    }


    
}
