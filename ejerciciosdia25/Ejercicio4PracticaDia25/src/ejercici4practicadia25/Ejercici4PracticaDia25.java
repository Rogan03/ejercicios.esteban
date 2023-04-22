/*


 */
package ejercici4practicadia25;

import java.util.Date;
import servicios.FechaService;

/**
 *
 * @author Esteban
 */
public class Ejercici4PracticaDia25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fechaNacimiento = new Date();
        Date fechaActual = new Date();
        FechaService fc = new FechaService();
        fechaNacimiento = fc.fechaNacimiento();
        fechaActual = fc.fechaActual();
        System.out.println(fechaNacimiento);
        System.out.println(fechaActual);
        System.out.println("Tu edad es: " + fc.tuEdad(fechaNacimiento, fechaActual));
    }
}
