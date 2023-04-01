/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Rectangulo {  
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void pregunta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base.");
        base = leer.nextInt();
        System.out.println("Ingrese altura.");
        altura = leer.nextInt();
    }

    public int calcularSuperficie() {
        int superf = base * altura;
        return superf;
    }

    public int calcularPerimetro() {
        int per = (base + altura) * 2;
        return per;
    }

    public void mostrarCosas() {
        System.out.println("-----------------");
        System.out.println("BASE INGRESADA: " + base);
        System.out.println("ALTURA INGRESADA: " + altura);
        System.out.println("SUPERFICIE: " + calcularSuperficie());
        System.out.println("PERIMETRO: " + calcularPerimetro());
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if ((i == 0) || (i == base - 1) || (j == 0) || (j == altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
