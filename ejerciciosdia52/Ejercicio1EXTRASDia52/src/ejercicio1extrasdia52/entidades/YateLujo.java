/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1extrasdia52.entidades;

/**
 *
 * @author Esteban
 */
public class YateLujo extends Motorizado {

    private int numCamarotes;

    public YateLujo() {
    }

    public YateLujo(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public void crearLujo() {
        crearMotorizado();
        System.out.println("Cuantos camarotes deseas?");
        this.numCamarotes = (leer.nextInt());
    }

    @Override
    public void calcularAlquiler() {
        crearLujo();
        this.longitud = 22;
        int valorBase = longitud * 100;
        long tiempo = fechaDe.getTime() - fechaRe.getTime();
        long se = tiempo / 1000;
        long mi = se / 60;
        long ho = mi / 60;
        long di = ho / 24;
        int aux = (int) (di * valorBase);
        int aux2 = potencia * 1000;
        int aux3 = numCamarotes * 10000;
        int precioFinal = valorBase + aux + aux2 + aux3;
        System.out.println("-----------------");
        System.out.println("Navios 'La Sinverguenza':.");
        System.out.println("FACTURA:");
        System.out.println("Cargos facturados:");
        System.out.println("-----------------");
        System.out.println("Costo base: Yate Lujoso $" + valorBase);
        System.out.println("Dias contratados: " + di);
        System.out.println("Potencia motor: " + potencia);
        System.out.println("Camarotes: " + numCamarotes);
        System.out.println("-----------------");
        System.out.println("TOTAL:");
        System.out.println("$" + precioFinal);
        System.out.println("IMPUESTO AFIP 666.99%");
        System.out.println("-----------------");
    }
}
