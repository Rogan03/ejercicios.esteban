/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extrasdia52.entidades;

/**
 *
 * @author Esteban
 */
public class Oficinas extends Edificio {

    private int pisos;
    private int cantiOfi;
    private int perOfi;

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getCantiOfi() {
        return cantiOfi;
    }

    public void setCantiOfi(int cantiOfi) {
        this.cantiOfi = cantiOfi;
    }

    public int getPerOfi() {
        return perOfi;
    }

    public void setPerOfi(int perOfi) {
        this.perOfi = perOfi;
    }
    
    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie es: " + largo*ancho*pisos);
        System.out.println("---------");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen es: " + largo*ancho*alto*pisos);
        System.out.println("-----------------");
    }

    public Oficinas() {
    }

    public Oficinas(int ancho, int alto, int largo) {
        super(ancho, alto, largo);
    }
    
    public void laburantes() {
        int aux = pisos * cantiOfi * perOfi;
        System.out.println("Tenemos " + aux/pisos + " trabajadores por piso.");
        System.out.println(aux + " personas en total trabajan en el edificio.");
        System.out.println("---------");
    }
}
