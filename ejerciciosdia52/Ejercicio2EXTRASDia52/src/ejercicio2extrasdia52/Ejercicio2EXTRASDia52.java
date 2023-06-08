/*
 */
package ejercicio2extrasdia52;

import ejercicio2extrasdia52.entidades.Edificio;
import ejercicio2extrasdia52.entidades.Oficinas;
import ejercicio2extrasdia52.entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class Ejercicio2EXTRASDia52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> ed = new ArrayList();
        //polideportivo 1
        Polideportivo po1 = new Polideportivo();
        po1.setNombre("Semillitas");
        po1.setTipo("Techado");
        po1.setAlto(7);
        po1.setAncho(15);
        po1.setLargo(30);
        ed.add(po1);
        //polideportivo 2
        Polideportivo po2 = new Polideportivo();
        po2.setNombre("Semillotas");
        po2.setTipo("Descubierto");
        po2.setAlto(9);
        po2.setAncho(20);
        po2.setLargo(32);
        ed.add(po2);
        //oficina 1
        Oficinas of1 = new Oficinas();
        of1.setPisos(2);
        of1.setPerOfi(2);
        of1.setCantiOfi(6);
        of1.setAlto(20);
        of1.setAncho(6);
        of1.setLargo(6);
        ed.add(of1);
        //oficina 2
        Oficinas of2 = new Oficinas();
        of2.setPisos(3);
        of2.setCantiOfi(3);
        of2.setPerOfi(7);
        of2.setAlto(20);
        of2.setAncho(8);
        of2.setLargo(5);
        ed.add(of2);
        
        int aux = 0;

        for (Edificio edificio : ed) {
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            if (edificio instanceof Polideportivo) {
                if (((Polideportivo) edificio).getTipo().equalsIgnoreCase("Techado")) {
                    aux++;
                }
            } else {
                ((Oficinas)edificio).laburantes(); //aqui casteo edificio a oficina para obtener el metodo
            }
        }
        System.out.println("Hay " + aux + " polideportivos techados.");
    }
}
