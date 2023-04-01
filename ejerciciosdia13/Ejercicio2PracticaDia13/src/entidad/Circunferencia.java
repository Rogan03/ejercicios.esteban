/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }
    

    public Circunferencia(double radio) {
        this.radio = radio; 
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio.");
        radio = leer.nextDouble();
    }
    
    public void crearArea() {
        System.out.println("El área es: " + Math.PI * (Math.pow (radio,2)));
    }
    
    public void crearPerimetro() {
        System.out.println("El perímetro es: " + (2 * Math.PI * radio));
    }
    
}

