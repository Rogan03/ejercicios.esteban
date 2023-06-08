/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2practicadia52.entidades;

/**
 *
 * @author Esteban
 */
public class Televisor extends Electrodomestico {

    private int tamanio;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int tamanio, boolean sintonizador) {
        this.tamanio = tamanio;
        this.sintonizador = sintonizador;
    }

    public Televisor(int tamanio, boolean sintonizador, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.tamanio = tamanio;
        this.sintonizador = sintonizador;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        tamanio = 50;
        sintonizador = true;
    }

    
    @Override
    public void precioFinal() {
        crearTelevisor();
        switch (consumo) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
        }
        if (peso < 20) {
            precio += 100;
        } else if (peso < 50) {
            precio += 500;
        } else if (peso < 80) {
            precio += 800;
        } else {
            precio += 1000;
        }
        if (tamanio > 40) {
            precio += precio*0.3;
        }
        if (sintonizador) {
            precio += 500;
        }
        System.out.println("El precio final del televisor es: " + precio);
    }
}
