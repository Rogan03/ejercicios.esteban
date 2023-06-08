/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1extrasdia52.entidades;

import java.util.Date;

/**
 *
 * @author Esteban
 */
public class Barco {

    protected int matricula;
    protected int longitud;
    protected int anioFab;
    protected String nombre = "Jorge Ausente";
    protected int dni = 14556767;
    protected Date fechaRe = new Date(2023 - 1900, 3, 12);
    protected Date fechaDe = new Date(2023 - 1900, 4, 22); //41 dias

    public Barco() {
    }

    public Barco(int matricula, int longitud, int anioFab, Date fechaRe, Date fechaDe) {
        this.matricula = matricula;
        this.longitud = longitud;
        this.anioFab = anioFab;
        this.fechaRe = fechaRe;
        this.fechaDe = fechaDe;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaRe() {
        return fechaRe;
    }

    public void setFechaRe(Date fechaRe) {
        this.fechaRe = fechaRe;
    }

    public Date getFechaDe() {
        return fechaDe;
    }

    public void setFechaDe(Date fechaDe) {
        this.fechaDe = fechaDe;
    }

    public void calcularAlquiler() {
        long tiempo = fechaRe.getTime() - fechaDe.getTime();
        int aux = (int) (tiempo / 86400000);
        int precioFinal = (longitud * 10) * aux;
    }
}
