package extra_03;
//Crea una clase "Juego" que tenga un método "iniciar_juego" 
//que permita a dos jugadores jugar un juego de adivinanza de números.
//El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
//El segundo jugador tiene un número limitado de intentos y recibe una pista 
//de "más alto" o "más bajo" después de cada intento. El juego termina cuando 
//el segundo jugador adivina el número o se queda sin intentos. 

//Registra el número de
//intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

import Entidad.Juego;
import java.util.Scanner;

public class Extra_03 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Juego j1 = new Juego();
        j1.iniciarJuego();
        System.out.println("Resultados\n" + j1.toString());
        
        System.out.println("Desea continuar? S/N: ");
        String res = leer.next();
        while (res.equalsIgnoreCase("S")){
            j1.iniciarJuego();
            System.out.println("Resultados\n" + j1.toString());
            System.out.println("Desea continuar? S/N: ");
            res= leer.next();
        }
    }
    
}
