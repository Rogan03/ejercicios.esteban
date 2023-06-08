/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Esteban
 */
public class Butacas {
    private int fila;
    private String columna;
    private boolean ocupado;

    public Butacas() {
    }

    public Butacas(int fila, String columna, boolean ocupado) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = ocupado;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return fila + columna;
    }
    
    
}
