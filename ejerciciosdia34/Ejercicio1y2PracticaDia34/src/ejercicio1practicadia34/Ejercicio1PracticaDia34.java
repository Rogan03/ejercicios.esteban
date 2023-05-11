
package ejercicio1practicadia34;

import servicios.perroServiceGpt;

/**
 *
 * @author Esteban
 */
public class Ejercicio1PracticaDia34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        perroServiceGpt ps = new perroServiceGpt();
        ps.guardaPerro();
        ps.muestraPerro();
        ps.pidePerro();
        ps.mostrarOrdenada();
    }
}
