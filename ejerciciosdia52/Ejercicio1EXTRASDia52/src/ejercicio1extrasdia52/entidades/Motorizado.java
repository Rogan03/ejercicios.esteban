/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1extrasdia52.entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Motorizado extends Barco {

    Scanner leer = new Scanner(System.in);
    protected int potencia;

    public Motorizado() {
    }

    public Motorizado(int potencia) {
        this.potencia = potencia;
    }

    public Motorizado(int potencia, int matricula, int longitud, int anioFab, Date fechaRe, Date fechaDe) {
        super(matricula, longitud, anioFab, fechaRe, fechaDe);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(int anioFab) {
        this.anioFab = anioFab;
    }

    public void crearMotorizado() {
        System.out.println("Cuanta potencia deseas?");
        this.potencia = (leer.nextInt());
    }

    @Override
    public void calcularAlquiler() {
        crearMotorizado();
        this.longitud = 13;
        int valorBase = longitud * 100;
        long tiempo = fechaDe.getTime() - fechaRe.getTime();
        long se = tiempo / 1000;
        long mi = se / 60;
        long ho = mi / 60;
        long di = ho / 24;
        int aux = (int) (di * valorBase);
        int aux2 = potencia * 1000;
        int precioFinal = valorBase + aux + aux2;
        System.out.println("-----------------");
        System.out.println("Navios 'La Sinverguenza':.");
        System.out.println("Cargos facturados:");
        System.out.println("-----------------");
        System.out.println("Costo base: Motorizado $" + valorBase);
        System.out.println("Dias contratados: " + di);
        System.out.println("Potencia motor: " + potencia);
        System.out.println("-----------------");
        System.out.println("TOTAL:");
        System.out.println("$" + precioFinal);
        System.out.println("IMPUESTO AFIP 666.99%");
        System.out.println("-----------------");
    }
}
