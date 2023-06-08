/*
 * Click nbfs: nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs: nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2practicadia52.entidades;

/**
 *
 * @author Esteban
 */
public class Electrodomestico {

    protected int precio;
    protected String color;
    protected char consumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (letra <= 'F') {
            consumo = letra;
        } else {
            consumo = 'F';
        }
    }

    public void comprobarColor(String color) {
        if ("blanco".equals(color) || "negro".equals(color) || "rojo".equals(color) || "azul".equals(color) || "gris".equals(color)) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        precio = 1000;
        peso = 30;
        color = "rojo";
        comprobarColor(color);
        consumo = 'A';
        comprobarConsumoEnergetico(consumo);
    }

    public void precioFinal() {
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
    }
}
