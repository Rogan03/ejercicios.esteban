/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extrasdia52.entidades;

/**
 *
 * @author Esteban
 */
public class Polideportivo extends Edificio {

    private String nombre;
    private String tipo;

    public Polideportivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public Polideportivo(int ancho, int alto, int largo) {
        super(ancho, alto, largo);
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie es: " + largo*ancho);
        System.out.println("---------");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen es: " + largo*ancho*alto);
        System.out.println("-----------------");
    }

}
