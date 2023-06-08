/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package entidades;

/**
 *
 * @author Esteban
 */
public class Jugador {
    private int lugar;
    private String nombre;
    private boolean moja2 = false;
    
    public void disparo(Revolver r) {
        r.mojar();
    }

    public Jugador() {
    }

    public Jugador(int lugar, String nombre) {
        this.lugar = lugar;
        this.nombre = nombre;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMoja2() {
        return moja2;
    }

    public void setMoja2(boolean moja2) {
        this.moja2 = moja2;
    }

    @Override
    public String toString() {
        return "Jugador{" + "lugar=" + lugar + ", nombre=" + nombre + ", moja2=" + moja2 + '}';
    }
    
    
}
