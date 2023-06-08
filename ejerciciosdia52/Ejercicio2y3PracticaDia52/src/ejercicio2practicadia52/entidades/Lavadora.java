/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2practicadia52.entidades;

/**
 *
 * @author Esteban
 */
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        crearElectrodomestico();
        carga = 60;
    }
    
    @Override
    public void precioFinal() {
        crearLavadora();
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
        if (carga > 30) {
            precio += 500;
        }
        System.out.println("El precio final de la lavadora es: " + precio);
    }
}
